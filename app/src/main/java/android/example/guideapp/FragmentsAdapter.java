package android.example.guideapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentsAdapter extends FragmentStateAdapter {


    public FragmentsAdapter(FragmentActivity fm) {
        super(fm);
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new SchoolsFragment();
        } else if (position == 1) {
            return new HospitalsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new OutSideFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getItemCount() {
        return 4;
    }

}