package appewtc.masterung.drugandhealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class DrugActivity extends AppCompatActivity {

    //Explicit
    private ImageView waterImageView, grainImageView, skinImageView, otherImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug);

        bindWidget();

    }   // onCreate

    private void bindWidget() {

    }

}   // Main Class
