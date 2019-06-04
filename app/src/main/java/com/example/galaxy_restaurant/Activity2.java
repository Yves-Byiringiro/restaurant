package com.example.galaxy_restaurant;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;


public class Activity2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

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


        drawerLayout =(DrawerLayout) findViewById(R.id.drawernavigation);
        navigationView =(NavigationView) findViewById(R.id.navigationview);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {


       int id= menuItem.getItemId();

        switch(id){

            case R.id.add_dishes:

                Intent add_dishes= new Intent(Activity2.this,Activity3.class);
                startActivity(add_dishes);
                break;

            case R.id.receipt_dishes:

                Intent rec_dishes= new Intent(Activity2.this,Activity3.class);
                startActivity(rec_dishes);
                break;

            case R.id.favourable:
                Intent fav_dishes= new Intent(Activity2.this,Activity3.class);
                startActivity(fav_dishes);
                break;

            case R.id.view_dishes:
                Intent view_dishes= new Intent(Activity2.this,Activity3.class);
                startActivity(view_dishes);
                break;


            case R.id.resto:
                Intent near= new Intent(Activity2.this,Activity3.class);
                startActivity(near);
                break;

            case R.id.login:
                Intent login= new Intent(Activity2.this,Activity3.class);
                startActivity(login);
                break;

            case R.id.logout:
                Intent logout= new Intent(Activity2.this,MainActivity.class);
                startActivity(logout);
                break;


        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }


}

