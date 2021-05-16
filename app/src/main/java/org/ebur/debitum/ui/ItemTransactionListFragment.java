package org.ebur.debitum.ui;


import android.view.View;
import android.widget.TextView;

import org.ebur.debitum.R;
import org.ebur.debitum.database.Person;
import org.ebur.debitum.database.TransactionWithPerson;

import java.util.List;
import java.util.Locale;

// like TransactionListFragment but shows only non-monetary items
public class ItemTransactionListFragment extends TransactionListFragment {

    @Override
    protected void subscribeToViewModel() {
        viewModel.getItemTransactions().observe(getViewLifecycleOwner(), transactions -> {
            Person filterPerson = personFilterViewModel.getFilterPerson();
            List<TransactionWithPerson> listForAdapter = filter(transactions, filterPerson);
            updateTotalHeader(TransactionWithPerson.getNumberOfItems(listForAdapter));
            adapter.submitList(listForAdapter);
            if(transactions.isEmpty()) {
                recyclerView.setVisibility(View.GONE);
                emptyView.setVisibility(View.VISIBLE);
            } else {
                recyclerView.setVisibility(View.VISIBLE);
                emptyView.setVisibility(View.GONE);
            }
        });
    }

    @Override
    protected void setupTotalHeader(View root) {
        TextView descView = root.findViewById(R.id.header_description);
        descView.setVisibility(View.VISIBLE);
    }

    @Override
    protected void updateTotalHeader(int total) {
        TextView totalView = requireView().findViewById(R.id.header_total);
        totalView.setText(String.format(Locale.getDefault(), "%d", total));
    }
}
