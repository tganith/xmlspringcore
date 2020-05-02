package com.mylabs.xmlspringcore.example1.beans;


public class Address {

    private int pin;
    private String streetName;
    private String city;


    public Address(){
        System.out.println("Address object created !!!");
    }

    public Address(int pin, String streetName, String city){
        this.pin = pin;
        this.streetName = streetName;
        this.city = city;

    }

    public void display(){
        System.out.println("PIN :"+pin+" ,Street Name:"+streetName+" ,city:"+city);
    }


}
