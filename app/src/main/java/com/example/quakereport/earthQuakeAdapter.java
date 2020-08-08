package com.example.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;

public class earthQuakeAdapter extends ArrayAdapter<earthQuake> {
    private Context mContext;
    private int mResource;

    public static class ViewHolder{
      TextView magnitude;
      TextView city;
      TextView date;
    }

 //this is constructor
    public earthQuakeAdapter(Context context, int resource , ArrayList<earthQuake> objects) {
        super(context, resource , objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        //get the earthQuake information
        String magnitude =getItem(position).getMagnitude();
        String city = getItem(position).getCity();
        String date = getItem(position).getDate();

        //create the earthQuake object with the information
        earthQuake earthQuake = new earthQuake(magnitude , city , date);

        //View holder object
        ViewHolder holder;
        if(convertView == null){
            LayoutInflater layoutInflater =LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(mResource , parent , false);
            holder = new ViewHolder();
            holder.magnitude = (TextView)convertView.findViewById(R.id.magnitude);
            holder.city = (TextView) convertView.findViewById(R.id.city);
            holder.date = (TextView) convertView.findViewById(R.id.date);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.magnitude.setText(earthQuake.getMagnitude());
        holder.city.setText(earthQuake.getCity());
        holder.date.setText(earthQuake.getDate());
        return convertView;
    }
}
