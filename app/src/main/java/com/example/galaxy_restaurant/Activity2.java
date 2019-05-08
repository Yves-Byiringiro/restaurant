package com.example.galaxy_restaurant;

import android.app.Activity;
import android.media.Image;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
     ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer);
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
        ArrayAdapter<String>Adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Dishesname);
        listView.setAdapter(Adapter);



        drawerLayout =(DrawerLayout) findViewById(R.id.drawernavigation);
        navigationView =(NavigationView) findViewById(R.id.navigationview);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();


    }


}
