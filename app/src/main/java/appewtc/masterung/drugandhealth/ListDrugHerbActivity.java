package appewtc.masterung.drugandhealth;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

public class ListDrugHerbActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView;
    private ListView drugListView;
    private String strTitle, keyString;
    private String[] titleDrugStrings;
    private int keyAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_drug_herb);

        bindWidget();

        showView();

        createListView();

    }   // onCreate

    private void createListView() {

        //Tester
        String[] strTester = {"ทดสอบที่ 1", "ทดสอบที่ 2", "ทดสอบที่ 3", "ทดสอบที่ 4",
                "ทดสอบที่ 5", "ทดสอบที่ 6", "ทดสอบที่ 7", "ทดสอบที่ 8", "ทดสอบที่ 9", "ทดสอบที่ 10"};

        //Create Cursor From Where

        switch (keyAnInt) {
            case 1:
                keyString = "น้ำ";
                break;
            case 2:
                keyString = "เม็ด";
                break;
            case 3:
                keyString = "ทา";
                break;
            default:
                break;
        }


        try {

            SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase("drug.db", MODE_PRIVATE, null);



            Cursor objCursor = objSqLiteDatabase.rawQuery("SELECT * FROM drugTABLE WHERE Type1 = " + "'" + keyString + "'", null );

            objCursor.moveToFirst();

            titleDrugStrings = new String[objCursor.getCount()];

            for (int i=0; i<objCursor.getCount();i++) {

                titleDrugStrings[i] = objCursor.getString(objCursor.getColumnIndex("Drug_Name"));
                objCursor.moveToNext();

            }   // for
            objCursor.close();

        } catch (Exception e) {

        }   // try


        MyAdapter objMyAdapter = new MyAdapter(ListDrugHerbActivity.this, keyAnInt, titleDrugStrings);
        drugListView.setAdapter(objMyAdapter);

    }   // createListView


    private void showView() {

        strTitle = getIntent().getStringExtra("Title");
        keyAnInt = getIntent().getIntExtra("key", 1);   // 1-> น้ำ, 2->เม็ด, 3->ทา, 4->อื่น



        //Show Title
        titleTextView.setText(strTitle);

    }

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.txtShowHead);
        drugListView = (ListView) findViewById(R.id.listView);
    }

}   // Main Class
