package appewtc.masterung.drugandhealth;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class ListDrugHerbActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView;
    private ListView drugListView;
    private String strTitle, keyString;
    private String[] titleDrugStrings,
            typeDrugStrings, properiesStrings, howToStrings;
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
            case 4:
                keyString = "อื่นๆ";
                break;
            case 5:
                keyString = "ยาใช้ภายนอก";
                break;
            case 6:
                keyString = "ยาใช้ภานใน";
                break;
            default:
                break;
        }


        try {

            SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase("drug.db", MODE_PRIVATE, null);

            Cursor objCursor = objSqLiteDatabase.rawQuery("SELECT * FROM drugTABLE WHERE Type1 = " + "'" + keyString + "'", null );

            objCursor.moveToFirst();

            titleDrugStrings = new String[objCursor.getCount()];
            typeDrugStrings = new String[objCursor.getCount()];
            properiesStrings = new String[objCursor.getCount()];
            howToStrings = new String[objCursor.getCount()];

            for (int i=0; i<objCursor.getCount();i++) {

                titleDrugStrings[i] = objCursor.getString(objCursor.getColumnIndex("Drug_Name"));
                typeDrugStrings[i] = objCursor.getString(objCursor.getColumnIndex("Type1"));
                properiesStrings[i] = objCursor.getString(objCursor.getColumnIndex("Properties"));
                howToStrings[i] = objCursor.getString(objCursor.getColumnIndex("HowToUse"));

                objCursor.moveToNext();

            }   // for
            objCursor.close();

        } catch (Exception e) {

        }   // try


        MyAdapter objMyAdapter = new MyAdapter(ListDrugHerbActivity.this, keyAnInt, titleDrugStrings);
        drugListView.setAdapter(objMyAdapter);

        drugListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent objIntent = new Intent(ListDrugHerbActivity.this, DetailActivity.class);

                objIntent.putExtra("Drug_Name", titleDrugStrings[i]);
                objIntent.putExtra("Type", typeDrugStrings[i]);
                objIntent.putExtra("Properties", properiesStrings[i]);
                objIntent.putExtra("HowTo", howToStrings[i]);

                startActivity(objIntent);

            }   // event
        });

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
