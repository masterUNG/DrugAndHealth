package appewtc.masterung.drugandhealth;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Calendar;

public class PersonalActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_personal);

        //Bind Widget
        bindWidget();

        //RadioController
        radioController();

    }   // onCreate

    private void radioController() {



        alertRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.radioButton:
                        alertAnInt = 3;
                        minAlarmAnInt = 1;
                        break;
                    case R.id.radioButton2:
                        alertAnInt = 6;
                        minAlarmAnInt = 2;
                        break;
                    case R.id.radioButton3:
                        alertAnInt = 8;
                        minAlarmAnInt = 3;
                        break;
                }

            }
        });

    }


    private void bindWidget() {

        nameUserEditText = (EditText) findViewById(R.id.editText);
        historyEditText = (EditText) findViewById(R.id.editText3);
        usedEditText = (EditText) findViewById(R.id.editText4);
        allergiesEditText = (EditText) findViewById(R.id.editText5);
        resistanceEditText = (EditText) findViewById(R.id.editText6);
        myDrugEditText = (EditText) findViewById(R.id.editText8);
        alertRadioGroup = (RadioGroup) findViewById(R.id.ragAlert);
        choice1RadioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton3);

    }

    public void clickSavePersonal(View view) {

        //Get Value From Edittext
        nameUserString = nameUserEditText.getText().toString().trim();
        historyString = historyEditText.getText().toString().trim();
        usedString = usedEditText.getText().toString().trim();
        allergiesString = allergiesEditText.getText().toString().trim();
        resistanceString = resistanceEditText.getText().toString().trim();
        myDrugString = myDrugEditText.getText().toString().trim();

        //Check Space
        if ((nameUserString.equals("")||
                historyString.equals("")||
                usedString.equals("")||
                allergiesString.equals("")||
                resistanceString.equals("")||
                myDrugString.equals(""))) {

            //ไม่ยอมให้ผ่าน
            MyAlertDialog objMyAlertDialog = new MyAlertDialog();
            objMyAlertDialog.myDialog(PersonalActivity.this, "มีช่องว่าง", "กรอกให้ครบทุกช่อง");

        } else {

            //ผ่านได้
            Calendar objCalendar = Calendar.getInstance();
            int intHr = objCalendar.get(Calendar.HOUR_OF_DAY);
            int intMinus = objCalendar.get(Calendar.MINUTE);

            timeAlertAnInt  = intHr + alertAnInt;

            Log.d("drug", "alertHr ==> " + Integer.toString(timeAlertAnInt));

            ManageTABLE objManageTABLE = new ManageTABLE(this);
            objManageTABLE.addNewValue(nameUserString,
                    historyString,
                    usedString,
                    allergiesString,
                    resistanceString,
                    myDrugString,
                    Integer.toString(timeAlertAnInt));

            testAlarm(minAlarmAnInt);   // Test ==> minAlarmAnInt Real alertAnInt * 60




        }   // if


    }   // clickSavePersonal

    private void testAlarm(int minAlarmAnInt) {

        Handler objHandler = new Handler();
        objHandler.postDelayed(new Runnable() {
            @Override
            public void run() {

                MediaPlayer alermMediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.intro_start_horse);
                alermMediaPlayer.start();

                Toast.makeText(PersonalActivity.this, "การแจ้งเตือน ของฉัน", Toast.LENGTH_LONG).show();

            }
        }, minAlarmAnInt*60*1000);

    }   // testAlarm

    private void testAddValue() {
        ManageTABLE objManageTABLE = new ManageTABLE(this);
        objManageTABLE.addNewValue("user", "history", "used", "Allerties", "Resistance", "MyDrug", "Alert");
    }

}   // Main Class
