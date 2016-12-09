package com.example.cairowalkingtour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView landMarks = (TextView) findViewById(R.id.landmarks);
        // Set a click listener on that View
        landMarks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the landmarks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent landMarksIntent = new Intent(MainActivity.this, LandmarksActivity.class);

                // Start the new activity
                startActivity(landMarksIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView cafes = (TextView) findViewById(R.id.cafes);
        // Set a click listener on that View
        cafes.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the landmarks category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent cafesIntent = new Intent(MainActivity.this, CafesActivity.class);

                // Start the new activity
                startActivity(cafesIntent);
            }
        });

        TextView restaurants = (TextView) findViewById(R.id.restaurants);
        restaurants.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);

            }
        });

        TextView whatsOn = (TextView) findViewById(R.id.whats_on);
        whatsOn.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                Intent whatsOnIntent = new Intent(MainActivity.this, WhatsOnActivity.class);
                startActivity(whatsOnIntent);
            }
        });
    }
}
