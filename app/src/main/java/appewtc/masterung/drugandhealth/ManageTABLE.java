package appewtc.masterung.drugandhealth;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterUNG on 11/10/15 AD.
 */
public class ManageTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String TABLE_USER = "userTABLE";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_USER = "User";
    public static final String COLUMN_HISTORY = "History";
    public static final String COLUMN_USED = "Used";
    public static final String COLUMN_ALLERGIES = "Allergies";
    public static final String COLUMN_RESISTANCE = "Resistance";
    public static final String COLUMN_MYDRUG = "MyDrug";
    public static final String COLUMN_ALERT = "Alert";




    public ManageTABLE(Context context) {

        //Create & Connected Database
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();

    }   // Constructor

    public long addNewValue(String strUser,
                            String strHistory,
                            String strUsed,
                            String strAllergies,
                            String strResistance,
                            String strMyDrug,
                            String strAlert) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_USER, strUser);
        objContentValues.put(COLUMN_HISTORY, strHistory);
        objContentValues.put(COLUMN_USED, strUsed);
        objContentValues.put(COLUMN_ALLERGIES, strAllergies);
        objContentValues.put(COLUMN_RESISTANCE, strResistance);
        objContentValues.put(COLUMN_MYDRUG, strMyDrug);
        objContentValues.put(COLUMN_ALERT, strAlert);

        return writeSqLiteDatabase.insert(TABLE_USER, null, objContentValues);
    }


}   // Main Class
