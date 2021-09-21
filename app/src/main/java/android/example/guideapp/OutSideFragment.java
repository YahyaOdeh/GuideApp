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
        places.add(new Place(getString(R.string.Climbat_Amman), getString(R.string.Climbat_Amman_address)));
        places.add(new Place(getString(R.string.Amman_Citadel), getString(R.string.Amman_Citadel_address)));
        places.add(new Place(getString(R.string.Temple_of_Hercules), getString(R.string.Temple_of_Hercules_address)));
        places.add(new Place(getString(R.string.The_Forest_Park), getString(R.string.The_Forest_Park_address)));
        places.add(new Place(getString(R.string.The_Hashemite_Plaza), getString(R.string.The_Hashemite_Plaza_address)));
        places.add(new Place(getString(R.string.The_Royal_Autimobile_Museum), getString(R.string.The_Royal_Autimobile_Museum_address)));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), places, R.color.category_out_side);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}