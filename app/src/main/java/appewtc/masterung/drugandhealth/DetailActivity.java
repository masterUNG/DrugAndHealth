package appewtc.masterung.drugandhealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView drugNameTextView, typeTextView, propertiesTextView, howToTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //Show View
        showView();


    }   // Main Method

    private void showView() {

        String strDrugName = getIntent().getStringExtra("Drug_Name");
        String strType = getIntent().getStringExtra("Type");
        String strProperties = getIntent().getStringExtra("Properties");
        String strHowTo = getIntent().getStringExtra("HowTo");

        drugNameTextView.setText(strDrugName);
        typeTextView.setText(strType);
        propertiesTextView.setText(strProperties);
        howToTextView.setText(strHowTo);


    }   // showView

    private void bindWidget() {

        drugNameTextView = (TextView) findViewById(R.id.txtDrugName);
        typeTextView = (TextView) findViewById(R.id.txtDrugType);
        propertiesTextView = (TextView) findViewById(R.id.txtProperies);
        howToTextView = (TextView) findViewById(R.id.txtHowto);

    }

}   // Main Class
