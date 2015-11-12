package appewtc.masterung.drugandhealth;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by masterUNG on 11/10/15 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper {

    //Explicit
    private static final String DATABASE_NAME = "drug.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_DRUG_TABLE = "create table drugTABLE (_id integer primary key, Drug_Name text, Type1 text, Type2 text, Properties text, HowToUse text);";
    private static final String CREATE_USER_TABLE = "create table userTABLE (_id integer primary key, User text, History text, Used text, Allergies text, Resistance text, Alert text);";

    public MyOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }   // Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_DRUG_TABLE);
        sqLiteDatabase.execSQL(CREATE_USER_TABLE);

        //Update drugTABLE
        String[] strDrug = new String[10];
        strDrug[0] = "insert into drugTABLE VALUES (null, 'nameDrug0', 'na', 'na', 'คุณสมบัติ', 'วิธีใช้');";
        strDrug[1] = "insert into drugTABLE VALUES (null, 'nameDrug1', 'na', 'na', 'คุณสมบัติ', 'วิธีใช้');";
        strDrug[2] = "insert into drugTABLE VALUES (null, 'nameDrug2', 'na', 'na', 'คุณสมบัติ', 'วิธีใช้');";
        strDrug[3] = "insert into drugTABLE VALUES (null, 'nameDrug3', 'na', 'na', 'คุณสมบัติ', 'วิธีใช้');";
        strDrug[4] = "insert into drugTABLE VALUES (null, 'nameDrug4', 'na', 'na', 'คุณสมบัติ', 'วิธีใช้');";
        strDrug[5] = "insert into drugTABLE VALUES (null, 'nameDrug5', 'na', 'na', 'คุณสมบัติ', 'วิธีใช้');";
        strDrug[6] = "insert into drugTABLE VALUES (null, 'nameDrug6', 'na', 'na', 'คุณสมบัติ', 'วิธีใช้');";
        strDrug[7] = "insert into drugTABLE VALUES (null, 'nameDrug7', 'na', 'na', 'คุณสมบัติ', 'วิธีใช้');";
        strDrug[8] = "insert into drugTABLE VALUES (null, 'nameDrug8', 'na', 'na', 'คุณสมบัติ', 'วิธีใช้');";
        strDrug[9] = "insert into drugTABLE VALUES (null, 'nameDrug9', 'na', 'na', 'คุณสมบัติ', 'วิธีใช้');";

        int intIndex = 0;
        while (intIndex < strDrug.length) {

            sqLiteDatabase.execSQL(strDrug[intIndex]);

            intIndex += 1;
        }   // while



    }   // onCreate

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   // Main Class
