package appewtc.masterung.drugandhealth;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;
import android.widget.ListView;

public class ReadAllUserListView extends ListActivity{

    //Explicit
    private ManageTABLE objManageTABLE;
    private SimpleCursorAdapter objSimpleCursorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_read_all_user_list_view);

        //Create ListView
        createListView();

    }   // Main Method

    private void createListView() {

        objManageTABLE = new ManageTABLE(this);
        Cursor objCursor = objManageTABLE.readAllData();
        String[] listUser = new String[]{ManageTABLE.COLUMN_USER};
        int[] target = new int[]{R.id.textView9};
        objSimpleCursorAdapter = new SimpleCursorAdapter(this, R.layout.usr_listview, objCursor, listUser, target);
        setListAdapter(objSimpleCursorAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Cursor objCursor = (Cursor) l.getItemAtPosition(position);
        String strUser = objCursor.getString(objCursor.getColumnIndex(ManageTABLE.COLUMN_USER));
        String strHistory = objCursor.getString(objCursor.getColumnIndex(ManageTABLE.COLUMN_HISTORY));
        String strUsed = objCursor.getString(objCursor.getColumnIndex(ManageTABLE.COLUMN_USED));
        String strAllergies = objCursor.getString(objCursor.getColumnIndex(ManageTABLE.COLUMN_ALLERGIES));
        String strResistance = objCursor.getString(objCursor.getColumnIndex(ManageTABLE.COLUMN_RESISTANCE));
        String strMyDrug = objCursor.getString(objCursor.getColumnIndex(ManageTABLE.COLUMN_MYDRUG));
        String strAlert = objCursor.getString(objCursor.getColumnIndex(ManageTABLE.COLUMN_ALERT));

        MyAlertDialog objMyAlertDialog = new MyAlertDialog();
        objMyAlertDialog.readAllDialog(ReadAllUserListView.this, strUser,
                strHistory,
                strUsed,
                strAllergies,
                strResistance,
                strMyDrug,
                strAlert);


    }
}   // Main Class
