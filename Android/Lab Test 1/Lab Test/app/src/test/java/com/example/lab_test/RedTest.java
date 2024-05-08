package com.example.lab_test;

import junit.framework.TestCase;

public class RedTest extends TestCase {

    public void testShowcolor() {
        Red color = new Red();
        color.name ="Red";

        assertEquals("Color is : Red",color.showcolor());
    }
}