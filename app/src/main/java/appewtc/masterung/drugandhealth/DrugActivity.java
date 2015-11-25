package appewtc.masterung.drugandhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DrugActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private ImageView waterImageView, grainImageView, skinImageView, otherImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug);

        bindWidget();

        imageController();

    }   // onCreate

    private void imageController() {
        waterImageView.setOnClickListener(this);
        grainImageView.setOnClickListener(this);
        skinImageView.setOnClickListener(this);
        otherImageView.setOnClickListener(this);
    }

    private void bindWidget() {

        waterImageView = (ImageView) findViewById(R.id.button7);
        grainImageView = (ImageView) findViewById(R.id.button8);
        skinImageView = (ImageView) findViewById(R.id.button9);
        otherImageView = (ImageView) findViewById(R.id.button12);

    }   // bindWidget

    @Override
    public void onClick(View view) {

        String strDrug = null;
        int intDrug = 1;

        switch (view.getId()) {
            case R.id.button7:
                strDrug = "Drug ชนิดน้ำ";
                intDrug = 1;
                break;
            case R.id.button8:
                strDrug = "Drug ชนิดเม็ด";
                intDrug = 2;
                break;
            case R.id.button9:
                strDrug = "Drug ชนิดทา";
                intDrug = 3;
                break;
            case R.id.button12:
                strDrug = "Drug ชนิดอื่นๆ";
                intDrug = 4;
                break;
        }   // switch


        //Intent to ListDrugHerb
        Intent objIntent = new Intent(DrugActivity.this, ListDrugHerbActivity.class);
        objIntent.putExtra("Title", strDrug);
        objIntent.putExtra("key", intDrug);
        startActivity(objIntent);

    }   // onClick

}   // Main Class
