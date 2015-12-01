package appewtc.masterung.drugandhealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
    }   // onCreate

    public void clickSavePersonal(View view) {

        //testAddValue();

    }   // clickSavePersonal

    private void testAddValue() {
        ManageTABLE objManageTABLE = new ManageTABLE(this);
        objManageTABLE.addNewValue("user", "history", "used", "Allerties", "Resistance", "MyDrug", "Alert");
    }

}   // Main Class
