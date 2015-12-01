package appewtc.masterung.drugandhealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PersonalActivity extends AppCompatActivity {

    //Explicit
    private EditText nameUserEditText, historyEditText, usedEditText,
            allergiesEditText, resistanceEditText, myDrugEditText;
    private RadioGroup alertRadioGroup;
    private RadioButton choice1RadioButton, choice2RadioButton, choice3RadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        //Bind Widget
        bindWidget();

    }   // onCreate

    private void bindWidget() {

        nameUserEditText = (EditText) findViewById(R.id.editText);
        historyEditText = (EditText) findViewById(R.id.editText3);
        usedEditText = (EditText) findViewById(R.id.editText4);
        allergiesEditText = (EditText) findViewById(R.id.editText5);
        resistanceEditText = (EditText) findViewById(R.id.editText6);
        myDrugEditText = (EditText) findViewById(R.id.editText8);

    }

    public void clickSavePersonal(View view) {

        //testAddValue();

    }   // clickSavePersonal

    private void testAddValue() {
        ManageTABLE objManageTABLE = new ManageTABLE(this);
        objManageTABLE.addNewValue("user", "history", "used", "Allerties", "Resistance", "MyDrug", "Alert");
    }

}   // Main Class
