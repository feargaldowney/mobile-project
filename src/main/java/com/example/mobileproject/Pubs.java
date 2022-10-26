package com.example.mobileproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Pubs extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.brog, R.drawable.impala, R.drawable.raven, R.drawable.bricklane, R.drawable.barbarella};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pubs);

        recyclerView = findViewById(R.id.pub_rv);

        s1 = getResources().getStringArray(R.array.Pubs);
        s2 = getResources().getStringArray(R.array.Description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

