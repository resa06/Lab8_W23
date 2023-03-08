package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> cityList = new ArrayList<>();  //initalizes the city list straight from the class


    @Test
    public void testAddCity() {
        CustomList list = new CustomList(null, cityList);

        City city = new City("Edmonton", "AB");
        list.addCity(city);  //now the list has a size of 1

        assertEquals(1, list.getCount());


    }

    @Test
    public void testHasCity() {

    }

    @Test
    public void testDeleteCity() {

        CustomList list = new CustomList(null, cityList);

        //creating a new city
        City city = new City("Edmonton", "AB");

        //adding the city
        list.add(city);

        //deleting the city
        list.deleteCity(city);
    }

    @Test
    public void testCountCities() {


    }
}
