package com.example.dydnr.sample3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;


import com.example.dydnr.sample3.Citydata.DummyData;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Button btnAdd;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerView = (RecyclerView)findViewById(R.id.city_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(DummyData.CityList, this);
        recyclerView.setAdapter(adapter);
        btnAdd = (Button)findViewById(R.id.button);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}