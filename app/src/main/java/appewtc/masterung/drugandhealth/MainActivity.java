package appewtc.masterung.drugandhealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ManageTABLE objManageTABLE;
    private EditText searchEditText;
    private String searchString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        searchEditText = (EditText) findViewById(R.id.editText2);

        //Request Database
        objManageTABLE = new ManageTABLE(this);

    }   // onCreate

    public void clickSearchButton(View view) {

        searchString = searchEditText.getText().toString().trim();

        //Check Space
        if (searchString.equals("")) {
            //Have Space
            MyAlertDialog objMyAlertDialog = new MyAlertDialog();
            objMyAlertDialog.myDialog(MainActivity.this, "โปรดกรอกให้ครบ", "กรุณากรอก ช่องค้นหา");

        } else {
            //No Space
            searchDrugName();

        }

    }   // clickSearchButton

    private void searchDrugName() {

        try {

            String[] strResule = objManageTABLE.searchDrug(searchString);
            String strType = strResule[2];
            String strProperies = strResule[4];
            String strHowto = strResule[5];

            Intent objIntent = new Intent(MainActivity.this, DetailActivity.class);
            objIntent.putExtra("Drug_Name", searchString);
            objIntent.putExtra("Type", strType);
            objIntent.putExtra("Properties", strProperies);
            objIntent.putExtra("HowTo", strHowto);
            startActivity(objIntent);

        } catch (Exception e) {
            MyAlertDialog objMyAlertDialog = new MyAlertDialog();
            objMyAlertDialog.myDialog(MainActivity.this, "No This User", "No " + searchString + " in my Database");
        }

    }   // searchDrug

    public void clickDrug(View view) {
        startActivity(new Intent(MainActivity.this, DrugActivity.class));
    }

    public void clickHerb(View view) {
       startActivity(new Intent(MainActivity.this, HerbActivity.class));
    }

    public void clickPersonal(View view) {
        startActivity(new Intent(MainActivity.this, PersonalActivity.class));
    }


}   // Main Class
