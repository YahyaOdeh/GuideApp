package android.example.guideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private int fragmentsP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton schoolBtn = findViewById(R.id.schools_button);
        ImageButton hospitalBtn = findViewById(R.id.hospitals_button);
        ImageButton outSideBtn = findViewById(R.id.out_side_button);
        ImageButton restaurantsBtn = findViewById(R.id.restaurants_button);

        schoolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentsP = 0;
                Intent i = new Intent(view.getContext(), FragmentsActivity.class);
                i.putExtra("Fragment", fragmentsP);
                startActivity(i);
                finish();
            }
        });

        hospitalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentsP = 1;
                Intent i = new Intent(view.getContext(), FragmentsActivity.class);
                i.putExtra("Fragment", fragmentsP);
                startActivity(i);
                finish();
            }
        });

        restaurantsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentsP = 2;
                Intent i = new Intent(view.getContext(), FragmentsActivity.class);
                i.putExtra("Fragment", fragmentsP);
                startActivity(i);
                finish();
            }
        });

        outSideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentsP = 3;
                Intent i = new Intent(view.getContext(), FragmentsActivity.class);
                i.putExtra("Fragment", fragmentsP);
                startActivity(i);
                finish();
            }
        });

    }
}