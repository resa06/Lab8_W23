package com.example.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
        this.cities = cities;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    public int getCount(){
        return cities.size();
    }

    public void addCity(City city){
        this.cities.add(city);  //we want to implement the methods as simply as we can.

        //Goal is to just get the method to work
    }

    public boolean hasCity(City city) {
        /**
         * Checks if a city is in the list
         * @return:
         *      A boolean. True if the city is in the list, and False if the city is not in the list
         */
        //Checks if the city is part of the customList
        //if (cities.contains(city)) {
            //return true;
        //} else {
            //return false;
        //}
    }

    public void deleteCity(City city) {
        /**
         * Deletes a city from the custom list
         */
        //Deletes the city on the custom list
        //this.cities.remove(city);
    }

    //public void countCities() {
        /**
         * Counts the number of cities in the custom list
         * @return:
         *      An integer for the number of cities in the list
         */
    //}

}
