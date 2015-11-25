package appewtc.masterung.drugandhealth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by masterUNG on 11/25/15 AD.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private int keyAnInt;
    private String[] titleStrings;

    public MyAdapter(Context objContext, int keyAnInt, String[] titleStrings) {
        this.objContext = objContext;
        this.keyAnInt = keyAnInt;
        this.titleStrings = titleStrings;
    }   // Constructor

    @Override
    public int getCount() {
        return titleStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //Setup Icon
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvIcon);
        iconImageView.setImageResource(myIcon(keyAnInt));

        //Setup Title
        TextView titleTextView = (TextView) objView1.findViewById(R.id.txtShowListName);
        titleTextView.setText(titleStrings[i]);


        return objView1;
    }

    private int myIcon(int keyAnInt) {

        int intImage = R.drawable.mm1;
        switch (keyAnInt) {
            case 1:
                intImage = R.drawable.mm1;
                break;
            case 2:
                intImage = R.drawable.mm3;
                break;
            case 3:
                intImage = R.drawable.mm2;
                break;
            case 4:
                intImage = R.drawable.mm4;
                break;
            case 5:
                intImage = R.drawable.mm2;
                break;
            case 6:
                intImage = R.drawable.mm3;
                break;
            default:
                break;
        }   // switch

        return intImage;
    }
}   // Main Class
