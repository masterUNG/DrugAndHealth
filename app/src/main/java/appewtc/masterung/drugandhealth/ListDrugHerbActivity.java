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

    }   // onCreate

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
