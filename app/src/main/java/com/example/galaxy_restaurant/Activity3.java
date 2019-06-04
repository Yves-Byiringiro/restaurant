package com.example.galaxy_restaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Activity3 extends AppCompatActivity {

    ListView listView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbr);
        setSupportActionBar(toolbar);


        ArrayList<String> Dishesname= new ArrayList<>();
        Dishesname.add("Dish1");
        Dishesname.add("Dish2");
        Dishesname.add("Dish3");
        Dishesname.add("Dish4");
        Dishesname.add("Dish5");
        Dishesname.add("Dish6");
        Dishesname.add("Dish7");
        Dishesname.add("Dish8");
        Dishesname.add("Dish9");
        Dishesname.add("Dish10");
        Dishesname.add("Dish11");
        Dishesname.add("Dish12");
        Dishesname.add("Dish13");
        Dishesname.add("Dish14");
        Dishesname.add("Dish15");

        listView=(ListView) findViewById(R.id.listview);
        ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Dishesname);
        listView.setAdapter(Adapter);

    }
}
