package com.example.galaxy_restaurant;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends ArrayAdapter<String> {



     private String[] dishesname;
     private String[] desc;
     private Integer[] imgid;
     private Activity context;
    public Adapter(Activity context, String[] dishesname,String[] desc,Integer[] imgid) {
        super(context, R.layout.listview_image_textview,dishesname);

        this.context=context;
        this.dishesname=dishesname;
        this.desc=desc;
        this.imgid=imgid;

    }

    @androidx.annotation.NonNull
    @Override
    public View getView(int position, @androidx.annotation.Nullable View convertView, @androidx.annotation.NonNull ViewGroup parent) {

      View r=convertView;
      ViewHolder viewHolder=null;

      if(r==null){


          LayoutInflater layoutInflater=context.getLayoutInflater();
          r=layoutInflater.inflate(R.layout.listview_image_textview,null,true);
          viewHolder=new ViewHolder(r);
          r.setTag(viewHolder);


      }
      else{


          viewHolder=(ViewHolder) r.getTag();
      }
      viewHolder.imw.setImageResource(imgid[position]);
      viewHolder.textw1.setText(dishesname[position]);
        viewHolder.textw1.setText(desc[position]);

        return r;
    }

    class ViewHolder{

        TextView textw1;
        TextView textw2;
        ImageView imw;


        ViewHolder(View v){

            textw1=(TextView) v.findViewById(R.id.dishes_name);
            textw2=(TextView) v.findViewById(R.id.dishes_description);
            imw=(ImageView) v.findViewById(R.id.image_listview);




        }
    }
}
