package android.example.guideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class SchoolsFragment extends Fragment {

    public SchoolsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.school_1), getString(R.string.school_address_1)));
        places.add(new Place(getString(R.string.school_2), getString(R.string.school_address_2)));
        places.add(new Place(getString(R.string.school_3), getString(R.string.school_address_3)));
        places.add(new Place(getString(R.string.school_4), getString(R.string.school_address_4)));
        places.add(new Place(getString(R.string.school_5), getString(R.string.school_address_5)));
        places.add(new Place(getString(R.string.school_6), getString(R.string.school_address_6)));
        places.add(new Place(getString(R.string.school_7), getString(R.string.school_address_7)));
        places.add(new Place(getString(R.string.school_8), getString(R.string.school_address_8)));
        places.add(new Place(getString(R.string.school_9), getString(R.string.school_address_9)));
        places.add(new Place(getString(R.string.school_10), getString(R.string.school_address_10)));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_school);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}