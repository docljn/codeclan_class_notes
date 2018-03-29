package example.docljn.com.butterflies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lornanoble on 23/01/2018.
 */

public class ButterflyAdapter extends ArrayAdapter<Butterfly> {
    public ButterflyAdapter(@NonNull Context context, ArrayList<Butterfly> butterflies) {
        super(context, 0, butterflies);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.display_row, parent, false);
        }
        Butterfly currentButterfly = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.imageView);
        imageView.setImageResource(currentButterfly.getImageID());

        TextView commonName = listItemView.findViewById(R.id.common_name);
        commonName.setText(currentButterfly.getCommonName());

        TextView latinName = listItemView.findViewById(R.id.latin_name);
        latinName.setText(currentButterfly.getLatinName());


        // attach the current butterfly to the newly created rowviewobject: listItemView as an Object
        // you'll need to cast it as a Butterfly when you retrieve it from the target activity
        // after it has been passed by the intent you create in the source activity
        listItemView.setTag(currentButterfly);

        return listItemView;
    }

}





