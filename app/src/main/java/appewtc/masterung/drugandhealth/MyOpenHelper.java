package appewtc.masterung.drugandhealth;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by masterUNG on 11/10/15 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

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
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   // Main Class
