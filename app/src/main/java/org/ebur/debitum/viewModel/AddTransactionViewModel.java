package org.ebur.debitum.viewModel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import org.ebur.debitum.database.Person;
import org.ebur.debitum.database.PersonRepository;

import java.util.Date;
import java.util.List;

public class AddTransactionViewModel extends AndroidViewModel {

    private final PersonRepository repository;
    private final LiveData<List<Person>> persons;
    private Date timestamp;
    private String name = "";

    public AddTransactionViewModel(Application application) {
        super(application);
        repository = new PersonRepository(application);
        persons = repository.getAllPersons();
    }

    public LiveData<List<Person>> getPersons() { return persons; }

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }
    // TODO rewrite using future, move to repository
    public int getPersonId() {
        for (Person person : persons.getValue()) {
            if(person.name.equals(this.name)) return person.idPerson;
        }
        return -1;
    }

    public void setTimestamp(Date timestamp) { this.timestamp = timestamp; }
    public Date getTimestamp() { return this.timestamp; }
}