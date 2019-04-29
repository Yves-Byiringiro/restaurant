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
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {
    private static final Object IMAGES = ;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer);
        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbr);
        setSupportActionBar(toolbar);

        ListView listViewv= findViewById(R.id.listview);
        CustomAdapter customAdapter= new CustomAdapter();
        listViewv.setAdapter(customAdapter);



        Integer [] IMAGES ={R.drawable.dish19,R.drawable.dish18,R.drawable.dish17,R.drawable.dish16,R.drawable.dish14,R.drawable.dish13,R.drawable.dish11,R.drawable.dish10,R.drawable.dish8,R.drawable.dish2};
        String[] NAMES ={"Dish1","Dish2","Dish3","Dish4","Dish5","Dish6","Dish7","Dish8","Dish9","Dish10"};
        String[] DESCRIPTIONS ={"Dish1 Min","Dish2 Dish1 Min","Dish3 Dish1 Min","Dish4 Dish1 Min","Dish5 Dish1 Min","Dish6 Dish1 Min","Dish7 Dish1 Min","Dish8 Dish1 Min","Dish9 Dish1 Min","Dish10 Dish1 Min"};

        drawerLayout =(DrawerLayout) findViewById(R.id.drawernavigation);
        navigationView =(NavigationView) findViewById(R.id.navigationview);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();


    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int i ) {
            return 0;
        }

        @Override
        public View getView(int i, View View, ViewGroup parent) {
            View view= getLayoutInflater().inflate(R.layout.customlayout, null);

            ImageView imageView=(ImageView) findViewById(R.id.imageView2);
            TextView textView_name=(TextView)findViewById(R.id.textView_name);
            TextView textView_description=(TextView)findViewById(R.id.textView2_description);


            imageView.setImageResource(IMAGES[i);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTIONS[i]);
            return view;
        }
    }


    }


}
