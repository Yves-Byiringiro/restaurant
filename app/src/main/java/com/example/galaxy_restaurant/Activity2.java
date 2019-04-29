package com.example.galaxy_restaurant;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.reflect.AccessibleObject;
import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    String[] dishesname={"Dish1","Dish2","Dish3","Dish4","Dish5","Dish6","Dish7","Dish8","Dish9","Dish10"};
  String[] desc={"This is IT","This is IT","cs IT","This is IT","This is T","This is IT","This is IT","This is IT","This is IT","This is IT"};
  Integer[] imgid={R.drawable.dish2,R.drawable.dish8,R.drawable.dish10,R.drawable.dish11,R.drawable.dish13,R.drawable.dish14,R.drawable.dish16,R.drawable.dish17,R.drawable.dish18,R.drawable.dish19};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer);
        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbr);
        setSupportActionBar(toolbar);

        ListView lv= (ListView)findViewById(R.id.lv);
        CustomListView customListview= new CustomListview(this,dishesname,desc,imgid);
        lv.setAdapter(customListview);


        drawerLayout =(DrawerLayout) findViewById(R.id.drawernavigation);
        navigationView =(NavigationView) findViewById(R.id.navigationview);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();





    }
}
