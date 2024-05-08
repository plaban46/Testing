package com.example.lab_test;

public class motorcycle extends vehicles{
    @Override
    public void drive() {
        color = new Red();
        color.name = "Red";
        milage = 1.5;
        petrol(0.5);
    }
}
