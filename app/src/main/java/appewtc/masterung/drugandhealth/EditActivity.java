package appewtc.masterung.drugandhealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
            allergiesString, resistanceString, myDrugString;
    private int alertAnInt = 3, timeAlertAnInt, minAlarmAnInt = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        //Bind Widget
        bindWidget();

    }   // Main Method

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
