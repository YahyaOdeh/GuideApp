package android.example.guideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FragmentsActivity extends AppCompatActivity {

    private int fragmentP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            fragmentP = extras.getInt("Fragment");
        }

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager2 viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        FragmentsAdapter adapter = new FragmentsAdapter(this);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        viewPager.setCurrentItem(fragmentP);

        TabLayout tabLayout = findViewById(R.id.tabs);

        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    if (position == 0) {
                        tab.setText(getString(R.string.schools));
                    } else if (position == 1) {
                        tab.setText(getString(R.string.hospitals));
                    } else if (position == 2) {
                        tab.setText(getString(R.string.restaurants));
                    } else {
                        tab.setText(getString(R.string.out_side));
                    }
                }
        ).attach();
    }
}