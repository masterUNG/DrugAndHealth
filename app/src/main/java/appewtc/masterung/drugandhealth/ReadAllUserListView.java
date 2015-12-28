package appewtc.masterung.drugandhealth;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;
import android.widget.ListView;

public class ReadAllUserListView extends ListActivity {

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

        //Show Alert
        showAlert(strUser,
                strHistory,
                strUsed,
                strAllergies,
                strResistance,
                strMyDrug,
                strAlert);





    }

    private void showAlert(final String strUser, final String strHistory, final String strUsed, final String strAllergies, final String strResistance, final String strMyDrug, final String strAlert) {

        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);
        objBuilder.setIcon(R.drawable.danger);
        objBuilder.setTitle(strUsed);
        objBuilder.setMessage("ประวัติ = " + strHistory + "\n" +
                "ผู้ใช้ = " + strUsed + "\n" +
                "Allergies = " + strAllergies + "\n" +
                "Resistance = " + strResistance + "\n" +
                "MyDrug = " + strMyDrug + "\n" +
                "Alert = " + strAlert);
        objBuilder.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objBuilder.setNegativeButton("Edit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent objIntent = new Intent(ReadAllUserListView.this, EditActivity.class);
                objIntent.putExtra("User", strUser);
                objIntent.putExtra("History", strHistory);
                objIntent.putExtra("Used", strUsed);
                objIntent.putExtra("Allergies", strAllergies);
                objIntent.putExtra("Resistance", strResistance);
                objIntent.putExtra("Drug", strMyDrug);
                objIntent.putExtra("Alert", strAlert);
                startActivity(objIntent);
            }
        });

        objBuilder.setNeutralButton("Delete", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                deleteMyData(strUser);

            }
        });


        objBuilder.show();


    }   // showAlert

    private void deleteMyData(String strUser) {

        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.DATABASE_NAME, MODE_PRIVATE, null);

        //Delete
        Cursor deleteCursor = objSqLiteDatabase.rawQuery("SELECT * FROM userTABLE WHERE User = " + "'" + strUser + "'" , null);
        deleteCursor.moveToFirst();
        String strID = deleteCursor.getString(deleteCursor.getColumnIndex(ManageTABLE.COLUMN_ID));
        int intID = Integer.parseInt(strID);

        objSqLiteDatabase.delete(ManageTABLE.TABLE_USER, ManageTABLE.COLUMN_ID + "=" + intID, null);


        createListView();


    }
}   // Main Class
