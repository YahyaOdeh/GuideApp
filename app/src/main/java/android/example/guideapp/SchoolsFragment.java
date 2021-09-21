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
        places.add(new Place(getString(R.string.Al_Saadah_Collage_school), getString(R.string.Al_Saadah_Collage_school_address)));
        places.add(new Place(getString(R.string.Ahliyyah_Mutran_school), getString(R.string.Ahliyyah_Mutran_school_address)));
        places.add(new Place(getString(R.string.Oxford_school), getString(R.string.Oxford_school_address)));
        places.add(new Place(getString(R.string.The_International_Academy_school), getString(R.string.The_International_Academy_school_address)));
        places.add(new Place(getString(R.string.School_of_Choueifat), getString(R.string.School_of_Choueifat_address)));
        places.add(new Place(getString(R.string.Al_Asriyya_school), getString(R.string.Al_Asriyya_school_address)));
        places.add(new Place(getString(R.string.Amman_Academy_school), getString(R.string.Amman_Academy_school_address)));
        places.add(new Place(getString(R.string.International_Independent_school), getString(R.string.International_Independent_school_address)));
        places.add(new Place(getString(R.string.International_Leaders_school), getString(R.string.International_Leaders_school_address)));
        places.add(new Place(getString(R.string.Islamic_Educational_school), getString(R.string.Islamic_Educational_school_address)));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_school);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}