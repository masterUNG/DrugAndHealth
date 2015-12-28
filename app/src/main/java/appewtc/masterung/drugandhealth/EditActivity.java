package appewtc.masterung.drugandhealth;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EditActivity extends AppCompatActivity {

    //Explicit
    private EditText nameUserEditText, historyEditText, usedEditText,
            allergiesEditText, resistanceEditText, myDrugEditText;
    private RadioGroup alertRadioGroup;
    private RadioButton choice1RadioButton, choice2RadioButton, choice3RadioButton;
    private String nameUserString, historyString, usedString,
            allergiesString, resistanceString, myDrugString, alertString;
    private int alertAnInt = 3, timeAlertAnInt, minAlarmAnInt = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        //Bind Widget
        bindWidget();

        //Receive Value From Intent
        receiveValue();

        //Show View
        showView();

    }   // Main Method

    public void clickSaveEdit(View view) {

        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.DATABASE_NAME, MODE_PRIVATE, null);

        //Delete
        Cursor deleteCursor = objSqLiteDatabase.rawQuery("SELECT * FROM userTABLE WHERE User = " + "'" + nameUserString + "'" , null);
        deleteCursor.moveToFirst();
        String strID = deleteCursor.getString(deleteCursor.getColumnIndex(ManageTABLE.COLUMN_ID));
        int intID = Integer.parseInt(strID);

        objSqLiteDatabase.delete(ManageTABLE.TABLE_USER, ManageTABLE.COLUMN_ID + "=" + intID, null);

        //New Update

        nameUserString = nameUserEditText.getText().toString().trim();
        historyString = historyEditText.getText().toString().trim();
        usedString = usedEditText.getText().toString().trim();
        allergiesString = allergiesEditText.getText().toString().trim();
        resistanceString = resistanceEditText.getText().toString().trim();
        myDrugString = myDrugEditText.getText().toString().trim();

        ManageTABLE objManageTABLE = new ManageTABLE(this);
        objManageTABLE.addNewValue(nameUserString, historyString, usedString, allergiesString, resistanceString, myDrugString, alertString);


        Intent objIntent = new Intent(EditActivity.this, MainActivity.class);
        startActivity(objIntent);

    }   // clickSave

    public void clcikInforEdit(View view) {
        Intent objIntent = new Intent(EditActivity.this, ReadAllUserListView.class);
        startActivity(objIntent);
    }



    private void showView() {

        nameUserEditText.setText(nameUserString);
        historyEditText.setText(historyString);
        usedEditText.setText(usedString);
        allergiesEditText.setText(allergiesString);
        resistanceEditText.setText(resistanceString);
        myDrugEditText.setText(myDrugString);
        allergiesEditText.setText(alertString);

    }   // shwoView

    private void receiveValue() {

        nameUserString = getIntent().getStringExtra("User");
        historyString = getIntent().getStringExtra("History");
        usedString = getIntent().getStringExtra("Used");
        allergiesString = getIntent().getStringExtra("Allergies");
        resistanceString = getIntent().getStringExtra("Resistance");
        myDrugString = getIntent().getStringExtra("Drug");
        alertString = getIntent().getStringExtra("Alert");


    }   // receiveValue

    private void bindWidget() {

        nameUserEditText = (EditText) findViewById(R.id.edtText);
        historyEditText = (EditText) findViewById(R.id.edtText3);
        usedEditText = (EditText) findViewById(R.id.edtText4);
        allergiesEditText = (EditText) findViewById(R.id.edtText5);
        resistanceEditText = (EditText) findViewById(R.id.edtText6);
        myDrugEditText = (EditText) findViewById(R.id.edtText8);
        alertRadioGroup = (RadioGroup) findViewById(R.id.rgAlert);
        choice1RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton5);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton6);


    }   // bindWidget

}   // Main Class
