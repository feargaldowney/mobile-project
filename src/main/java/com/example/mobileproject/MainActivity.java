package com.example.mobileproject;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button pubs, activities, attractions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pubs = (Button) findViewById(R.id.pubs_btn);
        activities = (Button) findViewById(R.id.activities_btn);
        attractions = (Button) findViewById(R.id.attractions_btn);

        pubs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Pubs.class);
            startActivity(intent);
            }

        });
        activities.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activities.class);
                startActivity(intent);
            }

        });
        attractions.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Attractions.class);
                startActivity(intent);
            }

        });




    }


}