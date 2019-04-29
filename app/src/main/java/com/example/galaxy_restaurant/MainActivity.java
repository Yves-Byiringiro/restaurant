package com.example.galaxy_restaurant;

import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ProgressBar progressBar;
    Handler handler;
    Runnable runnable;
    Timer timer;
    TextView restoname;
    CircleImageView image;
    EditText username;
    EditText email;
    EditText password;
    Button login;
    Button register;
    TextInputLayout til;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbr);
        setSupportActionBar(toolbar);
       restoname=(TextView)findViewById(R.id.resto_name);
       image=(CircleImageView)findViewById(R.id.resto_image);
       username=(EditText)findViewById(R.id.username);
       email=(EditText)findViewById(R.id.email);
       password=(EditText)findViewById(R.id.password);
       login=(Button)findViewById(R.id.login_btn);
       register=(Button)findViewById(R.id.register_btn);


       TextInputLayout til= (TextInputLayout)findViewById(R.id.etusername);

           til.setErrorEnabled(false);
           til.setError("You need to enter a name");





        progressBar=(ProgressBar)findViewById(R.id.progressbar_id);
       progressBar.setVisibility(View.VISIBLE);
       handler= new Handler();
       runnable= new Runnable() {
           @Override
           public void run() {
               timer.cancel();
               progressBar.setVisibility(View.GONE);

           }
       };
       timer= new Timer();
       timer.schedule(new TimerTask() {
           @Override
           public void run() {

               handler.post(runnable);
           }
       },8000,1000);

       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent login;
               login=new Intent(MainActivity.this,Activity2.class);
               startActivity(login);
           }
       });



    }
}