package appewtc.masterung.drugandhealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class ListDrugHerbActivity extends AppCompatActivity {

    //Explicit
    private TextView titleTextView;
    private ListView drugListView;
    private String strTitle;
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


        MyAdapter objMyAdapter = new MyAdapter(ListDrugHerbActivity.this, keyAnInt, strTester);
        drugListView.setAdapter(objMyAdapter);

    }   // createListView


    private void showView() {

        strTitle = getIntent().getStringExtra("Title");
        keyAnInt = getIntent().getIntExtra("Key", 1);

        //Show Title
        titleTextView.setText(strTitle);

    }

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.txtShowHead);
        drugListView = (ListView) findViewById(R.id.listView);
    }

}   // Main Class
