package android.example.guideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.util.List;

public class PlacesAdapter extends ArrayAdapter<Place> {

    private int mColorResourceId;

    public PlacesAdapter(@NonNull Context context, @NonNull List<Place> places, int color) {
        super(context, 0, places);
        mColorResourceId = color;
    }

    @NonNull
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.restaruants_item_list, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView descriptionTextView = listItemView.findViewById(R.id.description_text_view);

        descriptionTextView.setText(currentPlace.getPlaceDescription());

        TextView placeTextView = listItemView.findViewById(R.id.place_name_text_view);

        placeTextView.setText(currentPlace.getPlaceName());

        ImageView placeImageView = listItemView.findViewById(R.id.image);

        if (currentPlace.hasimage()) {

            placeImageView.setImageResource(currentPlace.getImageRecourseID());

            placeImageView.setVisibility(View.VISIBLE);

        } else {
            placeImageView.setVisibility(View.GONE);

        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}