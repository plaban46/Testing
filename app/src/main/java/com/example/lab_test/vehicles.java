package com.example.lab_test;

public abstract class vehicles {
    public int wheels=0;
    public double fule=0;
    public double milage=0;
    Color color;

    public int wheels(){
        return wheels;
    }
    public double fuel(){
        return fule;
    }
    public double milage(){
        return milage;
    }
    public void petrol(double a){
        fule = fule + a;
    }
    public abstract void drive();
}
