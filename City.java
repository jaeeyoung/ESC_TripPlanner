package com.example.dydnr.sample3.Citydata;

/**
 * Created by dydnr on 2017-08-05.
 */

public class City {
    static String name;
    static int number;
    public City(String name, int number){
        this.name = name;
        this.number  =number;
    }
    public static String getName(){
        return name;
    }
    public static int getNumber(){
        return number;
    }
    public void setName(){
        this.name = name;
    }
    public void setNumber(){
        this.number = number;
    }
}
