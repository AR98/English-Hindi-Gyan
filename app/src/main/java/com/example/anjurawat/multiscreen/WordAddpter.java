package com.example.anjurawat.multiscreen;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAddpter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAddpter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
              mColorResourceId = colorResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentAndroidFlavor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.Eword);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidFlavor.getDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.Hword);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentAndroidFlavor.getHinditarnslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
      // imageView.setImageResource(currentAndroidFlavor.getImageResourceId());
       if (currentAndroidFlavor.hasImage()) {
                       // If an image is available, display the provided image based on the resource ID
                                imageView.setImageResource(currentAndroidFlavor.getImageResourceId());
                        // Make sure the view is visible
                                imageView.setVisibility(View.VISIBLE);
                    } else {
                        // Otherwise hide the ImageView (set visibility to GONE)
                                imageView.setVisibility(View.GONE);
                    }


        View textContainer = listItemView.findViewById(R.id.text_container);
               // Find the color that the resource ID maps to
                        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }


}
