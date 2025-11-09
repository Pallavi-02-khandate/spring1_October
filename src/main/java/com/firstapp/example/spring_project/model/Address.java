package com.firstapp.example.spring_project.model;

public class Address {
//    private int streetNo ;
//    private String streetName ;
//    private String cityName;


    public int streetNo ;
    public String streetName ;
    public String cityName;

    @Override
    public String toString() {
        return "Address{" +
                "streetNo=" + streetNo +
                ", streetName='" + streetName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
