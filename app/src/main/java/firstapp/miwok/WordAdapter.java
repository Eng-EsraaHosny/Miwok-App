package firstapp.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by User on 15/9/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int ColorId;
    public WordAdapter(Activity context, ArrayList<Word> Word,int ColorId) {
        // these 3 inputs are found in constructor of ArrayAdapter
        super(context, 0, Word);
        this.ColorId =ColorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // return super.getView(position, convertView, parent);
        View listItemView = convertView;
        if(listItemView == null) {
            // null means there are no items in list view
            //so if i choose items and put them in list view then
            //this condition is false and listItemView != null
            //then we start updating the text views & image view
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
            //false means we don't want to attach the list item view with the list view parent
    }

        Word wa = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.textView1);

        miwokTextView.setText(wa.getMiwokWords());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.textView2);

        defaultTextView.setText(wa.getDefaultWords());

        ImageView image= (ImageView) listItemView.findViewById(R.id.imageView);

        image.setImageResource(wa.getImageResourceId());

        // Check if an image is provided for this word or not
        if (wa.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            image.setImageResource(wa.getImageResourceId());
                       // Make sure the view is visible
                               image.setVisibility(View.VISIBLE);
                   } else {
                       // Otherwise hide the ImageView (set visibility to GONE)
                               image.setVisibility(View.GONE);
        }
        // Set the theme color for the list item
             View textContainer = listItemView.findViewById(R.id.text_container);
               // Find the color that the resource ID maps to
                      int color = ContextCompat.getColor(getContext(), ColorId);
        // Set the background color of the text container View
                        textContainer.setBackgroundColor(color);



        return listItemView;
    }
}
