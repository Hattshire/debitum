# v1.5.1
- translations update
- internal refactoring
- fix duplicate file provider authority when having debug and release build installed in parallel (#62) 

# v1.5.0
- transactions can have images attached (#21)
- when creating a new transaction and exactly one row is selected, its contents is used as preset (#40)
- use file picker when restoring database
- backup files with date appended (not overwritten anymore)
- backups are now a zip file containing the database and all attached images
- translations update

# v1.4.1
- translations update (new: french, italian by [@Edanas](https://hosted.weblate.org/user/Edanas/))
- new: avatar always reflects name in edit person dialog
- new: notification when editing a person linked to a deleted contact
- fixed: rounding errors for certain amounts (#54)

# v1.4.0
- new: persons now can have a linked phone contact. Linking is done from the edit person dialog. For this feature the READ_CONTACTS permission is needed (which you can safely deny without breaking Debitum).
- updated/new translations:
  - Brazilian Portuguese ([@mezysinc](https://github.com/mezysinc))
  - Norwegian Bokmål ([@comradekingu](https://github.com/comradekingu))
- fixed: transitions between bottom nav destinations
- update: material and junit library versions
- new: when selecting persons or money transactions in the list views, the sum of the selected items is shown in the contextual action bar
- new: warn when setting a return date before the original transaction's date
- new: added preference to set date format

# v1.3.3
- fix: crash when filtering for person without debt or with note (#34)

# v1.3.2
- add: animation for showing/hiding item-returned input
- add: separate hint for repaying money
- add: note about how to handle repaid money to guide 

# v1.3.1
- fix: EditTransactionFragment: Amount format correctly changed upon switching between item and money (#29)
- fix: New Transaction not hidden behind header bar anymore (#2)

# v1.3.0
- add: add return shortcut to money list (contextual action bar)
- change: make EditTransaction/Person dialogs scrollable so that everything can be revealed from behind the soft-keyboard
- fix: no more one-day-offset from selected date in timezones with negative UTC/GMT offset
- refactor: make EditTransaction's boolean arg "newItem" -->  integer "presetType" (nav graph, Dialog)

# v1.2.2
- fix: contextual action bar is now finished upon list change (could have crashed the app)
- fix: mark-returned-icon in the contextual action bar is now hidden when the selected item is already returned
- change: use MD5 for calculating a color from a person's name for better distribution of colors
- change: make "add person" button in edit transaction dialog stand out a little more

# v1.2.1
- add: setting to define standard filter for items list (all/unreturned/returned)
- change: guide is now displayed in fullscreen dialog
- fix: crash when trying to edit item's return date

# v1.2.0
- add: the generic gray person-icon in the person list is now a colored name-based icon
- add: brazilian portuguese translation ([@mezysinc](https://github.com/mezysinc))
- add: items can be marked as returned, the date is recorded and the item list can be filtered for returned/unreturned items 
- change: F-Droid metadata is now using better supported fastlane structure

# v1.1.0
- add: list with third party licenses in settings
- add: persons can have a note that is displayed in the filter bar
- change: use contextual action bar for displaying edit/delete menu items when selecting rows
- change: edit person button in filtered transaction list is now in filter bar instead of top toolbar
- change: amount is initially set to 1 for new item transactions
- change: focus is set to appropriate input fields in edit dialogs
- change: use cradle for floating action button (add transaction button)
- change: brighter icon foreground color (aztec->fjord)
- fix: error messages in edit transaction dialog are cleared now when something is entered
- refactor: moved all common code from the two list fragments (Transaction + PersonSum) to a new abstract superclass AbstractBaseListFragment
- refactor: move dialog toolbar to separate included layout

# v1.0.1
- add version info in settings
- add note on deletion of backup files upon uninstall in settings
- fix snackbars in People-List appearing in the wrong place
- fix date picker in edit transaction screen needing two clicks to appear
- add specific error message when trying to restore from backup and backup file was not found

# v1.0.0
initial release
