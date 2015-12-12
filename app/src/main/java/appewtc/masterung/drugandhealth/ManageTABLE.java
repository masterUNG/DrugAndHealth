package appewtc.masterung.drugandhealth;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
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

    public static final String TABLE_DRUG = "drugTABLE";
    public static final String COLUMN_Drug_Name = "Drug_Name";
    public static final String COLUMN_Type1 = "Type1";
    public static final String COLUMN_Type2 = "Type2";
    public static final String COLUMN_Properties = "Properties";
    public static final String COLUMN_HowToUse = "HowToUse";


    public ManageTABLE(Context context) {

        //Create & Connected Database
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();

    }   // Constructor

    public Cursor readAllData() {

        Cursor objCursor = readSqLiteDatabase.query(TABLE_USER,
                new String[]{COLUMN_ID, COLUMN_USER, COLUMN_HISTORY, COLUMN_USED, COLUMN_ALLERGIES, COLUMN_RESISTANCE, COLUMN_MYDRUG, COLUMN_ALERT},
                null, null, null, null, null);
        if (objCursor != null) {
            objCursor.moveToFirst();
        }

        return objCursor;
    }

    public String[] searchDrug(String strNameDrug) {

        try {

            String[] strResult = null;
            Cursor objCursor = readSqLiteDatabase.query(TABLE_DRUG,
                    new String[]{COLUMN_ID, COLUMN_Drug_Name, COLUMN_Type1, COLUMN_Type2, COLUMN_Properties, COLUMN_HowToUse},
                    COLUMN_Drug_Name + "=?",
                    new String[]{String.valueOf(strNameDrug)},
                    null, null, null, null);

            if (objCursor != null) {

                if (objCursor.moveToFirst()) {

                    strResult = new String[6];
                    for (int i=0; i<6; i++) {
                        strResult[i] = objCursor.getString(i);
                    }   // for



                }   //if2

            }   // if1

            objCursor.close();
            return strResult;

        } catch (Exception e) {
            return null;
        }


    }

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
