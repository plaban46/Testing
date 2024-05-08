package com.example.lab_test;

import static java.lang.Math.PI;

public class Circle extends Shape{
    int radius;
    @Override
    double area() {
        return 3.14*radius*radius;
    }

    @Override
    double perimeter() {
        return 2*3.14*radius;
    }
}
