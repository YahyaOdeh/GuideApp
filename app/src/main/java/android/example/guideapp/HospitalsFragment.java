package android.example.guideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HospitalsFragment extends Fragment {

    public HospitalsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.Jordan_hospital), getString(R.string.Jordan_hospital_address)));
        places.add(new Place(getString(R.string.Istishari_hospital), getString(R.string.Istishari_hospital_address)));
        places.add(new Place(getString(R.string.Ibn_Al_Haytham_hospital), getString(R.string.Ibn_Al_Haytham_hospital_address)));
        places.add(new Place(getString(R.string.Al_Rashid_hospital), getString(R.string.Al_Rashid_hospital_address)));
        places.add(new Place(getString(R.string.King_Hussain_Cancer_hospital), getString(R.string.King_Hussain_Cancer_hospital_address)));
        places.add(new Place(getString(R.string.Al_Khalidi_hospital), getString(R.string.Al_Khalidi_hospital_address)));
        places.add(new Place(getString(R.string.Istiklal_hospital), getString(R.string.Istiklal_hospital_address)));
        places.add(new Place(getString(R.string.Islamic_General_hospital), getString(R.string.Istishari_hospital_address)));
        places.add(new Place(getString(R.string.Al_Maqased_hospital), getString(R.string.Al_Maqased_hospital_address)));
        places.add(new Place(getString(R.string.Al_Esraa_hospital), getString(R.string.Al_Esraa_hospital_address)));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_hospitals);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}