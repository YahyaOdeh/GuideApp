package android.example.guideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.restaurant_1), getString(R.string.restaurant_address_1), R.drawable.rest_1));
        places.add(new Place(getString(R.string.restaurant_2), getString(R.string.restaurant_address_2), R.drawable.rest_2));
        places.add(new Place(getString(R.string.restaurant_3), getString(R.string.restaurant_address_3), R.drawable.rest_3));
        places.add(new Place(getString(R.string.restaurant_4), getString(R.string.restaurant_address_4), R.drawable.rest_4));
        places.add(new Place(getString(R.string.restaurant_5), getString(R.string.restaurant_address_5), R.drawable.rest_5));
        places.add(new Place(getString(R.string.restaurant_6), getString(R.string.restaurant_address_6), R.drawable.rest_6));
        places.add(new Place(getString(R.string.restaurant_7), getString(R.string.restaurant_address_7), R.drawable.rest_7));
        places.add(new Place(getString(R.string.restaurant_8), getString(R.string.restaurant_address_8), R.drawable.rest_8));
        places.add(new Place(getString(R.string.restaurant_9), getString(R.string.restaurant_address_9), R.drawable.rest_9));
        places.add(new Place(getString(R.string.restaurant_10), getString(R.string.restaurant_address_10), R.drawable.rest_10));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}