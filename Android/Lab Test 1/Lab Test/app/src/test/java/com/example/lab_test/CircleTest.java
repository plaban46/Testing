package com.example.lab_test;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

public class CircleTest extends TestCase {

    public void testArea() {
        Circle circle = new Circle();
        circle.name = "Circle";
        circle.radius = 2;

        assertEquals(12.56,circle.area(),01);
    }
}