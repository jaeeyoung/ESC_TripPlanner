package com.example.dydnr.sample3;

/**
 * Created by dydnr on 2017-08-05.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dydnr.sample3.Citydata.City;

import java.util.ArrayList;

/**
 * Created by jaeyoung on 2017. 8. 2..
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<City> citylist;
    private Context context;
    public Adapter(ArrayList<City> citylist, Context context){
        this.citylist = citylist;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_menu,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final City citydata = citylist.get(position);
        holder.cityname.setText(City.getName());
        holder.citynumber.setText(City.getNumber());

    }

    @Override
    public int getItemCount() {
        return citylist.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        TextView cityname,citynumber;
        public ViewHolder(View itemview){
            super(itemview);
            cityname = (TextView)itemview.findViewById(R.id.city_name);
            citynumber = (TextView)itemview.findViewById(R.id.city_number);
        }
    }
}