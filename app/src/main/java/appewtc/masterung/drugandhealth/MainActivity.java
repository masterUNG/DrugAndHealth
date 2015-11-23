package appewtc.masterung.drugandhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ManageTABLE objManageTABLE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Request Database
        objManageTABLE = new ManageTABLE(this);

    }   // onCreate

    public void clickDrug(View view) {
        startActivity(new Intent(MainActivity.this, DrugActivity.class));
    }

    public void clickHerb(View view) {
       startActivity(new Intent(MainActivity.this, HerbActivity.class));
    }


}   // Main Class
