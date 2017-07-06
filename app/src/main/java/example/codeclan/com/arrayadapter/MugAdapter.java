package example.codeclan.com.arrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class MugAdapter extends ArrayAdapter<Mug>
{
    public MugAdapter(Context context, ArrayList<Mug> mugList)
    {
        super(context, 0, mugList);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent)
    {
        //Check if the existing View is being reused, otherwise inflate the View
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.mug_item, parent, false);
        }

        Mug currentMug = getItem(position);

        CheckBox isFilthy = (CheckBox) listItemView.findViewById(R.id.cbx_filthy);
        isFilthy.setChecked(currentMug.isFilthy());

        TextView logoText = (TextView) listItemView.findViewById(R.id.txt_logo_text);
        logoText.setText(currentMug.getLogoText());

        TextView capacity = (TextView) listItemView.findViewById(R.id.txt_capacity);
        capacity.setText(Integer.toString(currentMug.getCapacity()));

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.img_mug);
        imageView.setImageResource(currentMug.getImage());

        listItemView.setTag(currentMug);

        return listItemView;
    }
}
