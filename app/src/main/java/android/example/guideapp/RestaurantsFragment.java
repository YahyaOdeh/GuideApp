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
        places.add(new Place(getString(R.string.Eostrix_Gastro_Pub), getString(R.string.Eostrix_Gastro_Pub_address), R.drawable.eostrix_gastro_pub_image));
        places.add(new Place(getString(R.string.Caprice), getString(R.string.Caprice_address), R.drawable.caprice_image));
        places.add(new Place(getString(R.string.Nur_Lebanese_Dining), getString(R.string.Nur_Lebanese_Dining_address), R.drawable.nur_lebanese_dining_image));
        places.add(new Place(getString(R.string.Salt), getString(R.string.Salt_address), R.drawable.salt_image));
        places.add(new Place(getString(R.string.Nasim), getString(R.string.Nasim_address), R.drawable.nasim_image));
        places.add(new Place(getString(R.string.Tamara), getString(R.string.Tamara_address), R.drawable.tamara_image));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_restaurants);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}