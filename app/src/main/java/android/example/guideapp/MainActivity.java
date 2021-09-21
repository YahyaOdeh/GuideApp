package android.example.guideapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

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
                Intent i = new Intent(view.getContext(), FragmentsActivity.class);
                startActivity(i);
                finish();
            }
        });

        hospitalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), FragmentsActivity.class);
                startActivity(i);
                finish();
            }
        });

        restaurantsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), FragmentsActivity.class);
                startActivity(i);
                finish();
            }
        });

        outSideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), FragmentsActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}