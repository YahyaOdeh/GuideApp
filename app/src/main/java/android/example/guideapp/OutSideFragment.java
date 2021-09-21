package android.example.guideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class OutSideFragment extends Fragment {

    public OutSideFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.out_side_1), getString(R.string.out_side_address_1)));
        places.add(new Place(getString(R.string.out_side_2), getString(R.string.out_side_address_2)));
        places.add(new Place(getString(R.string.out_side_3), getString(R.string.out_side_address_3)));
        places.add(new Place(getString(R.string.out_side_4), getString(R.string.out_side_address_4)));
        places.add(new Place(getString(R.string.out_side_5), getString(R.string.out_side_address_5)));
        places.add(new Place(getString(R.string.out_side_6), getString(R.string.out_side_address_6)));
        places.add(new Place(getString(R.string.out_side_7), getString(R.string.out_side_address_7)));
        places.add(new Place(getString(R.string.out_side_8), getString(R.string.out_side_address_8)));
        places.add(new Place(getString(R.string.out_side_9), getString(R.string.out_side_address_9)));
        places.add(new Place(getString(R.string.out_side_10), getString(R.string.out_side_address_10)));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_out_side);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}