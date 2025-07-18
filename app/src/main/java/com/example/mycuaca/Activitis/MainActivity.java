package com.example.mycuaca.Activitis;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.mycuaca.Adapters.HourlyAdapters;
import com.example.mycuaca.Domains.Hourly;
import com.example.mycuaca.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterHourly;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerview();
    }

    private void initRecyclerview(){
        ArrayList<Hourly> item = new ArrayList<>();

        item.add(new Hourly( "9 PM" , 28, "cloudy"));
        item.add(new Hourly( "11 PM" , 29, "sunny"));
        item.add(new Hourly( "12 AM" , 30, "wind"));
        item.add(new Hourly( "1 AM" , 26, "rainy"));
        item.add(new Hourly( "2 AM" , 24, "storm"));

        recyclerView=findViewById(R.id.view1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));

        adapterHourly=new HourlyAdapters(item);
        recyclerView.setAdapter(adapterHourly);



    }

}
