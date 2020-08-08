package com.example.quakereport;

public class earthQuake {
    // three String variable
       private String magnitude;
       private String city;
       private String date;
       //  make  public constructor
       public earthQuake(String magnitude , String city , String date ){
           this.magnitude = magnitude;
           this.city = city;
           this.date = date;
       }
       // getter methods
       public String getMagnitude(){return magnitude;}
       public String getCity(){return city;}
       public String getDate(){return date;}
}
