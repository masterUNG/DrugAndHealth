package appewtc.masterung.drugandhealth;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by masterUNG on 12/10/15 AD.
 */
public class MyAlertDialog {

    public void myDialog(Context context, String strTitle, String strMessage) {

        AlertDialog.Builder objBuilder = new AlertDialog.Builder(context);
        objBuilder.setIcon(R.drawable.danger);
        objBuilder.setTitle(strTitle);
        objBuilder.setMessage(strMessage);
        objBuilder.setCancelable(false);
        objBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objBuilder.show();

    }

    public void readAllDialog(Context context,
                              String strUser,
                              String strHistory,
                              String strUsed,
                              String strAllergies,
                              String strResistance,
                              String strMyDrug,
                              String strAlert) {
        AlertDialog.Builder objBuilder = new AlertDialog.Builder(context);
        objBuilder.setIcon(R.drawable.danger);
        objBuilder.setTitle(strUsed);
        objBuilder.setMessage("History = " + strHistory + "\n" +
                "Used = " + strUsed + "\n" +
                "Allergies = " + strAllergies + "\n" +
                "Resistance = " + strResistance + "\n" +
                "MyDrug = " + strMyDrug + "\n" +
                "Alert = " + strAlert);
        objBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objBuilder.show();
    }

}   // Main Class
