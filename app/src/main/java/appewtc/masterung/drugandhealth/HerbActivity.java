package appewtc.masterung.drugandhealth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class HerbActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private ImageView herbOutImageView, herbInImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herb);

        bindWidget();

        imageController();

    }   // onCreate

    private void imageController() {
        herbOutImageView.setOnClickListener(this);
        herbInImageView.setOnClickListener(this);
    }

    private void bindWidget() {
        herbOutImageView = (ImageView) findViewById(R.id.button10);
        herbInImageView = (ImageView) findViewById(R.id.button11);
    }

    @Override
    public void onClick(View view) {

        String strTitle = null;
        int intKey = 0;

        switch (view.getId()) {
            case R.id.button10:
                strTitle = "Herb ยาใช้ภายนอก";
                intKey = 5;
                break;
            case R.id.button11:
                strTitle = "Herb ยาใช้ภายใน";
                intKey = 6;
                break;
        }   // switch

        Intent objIntent = new Intent(HerbActivity.this, ListDrugHerbActivity.class);
        objIntent.putExtra("Title", strTitle);
        objIntent.putExtra("Key", intKey);
        startActivity(objIntent);

    }
}   // Main Class
