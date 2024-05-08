package com.example.lab_test;

import junit.framework.TestCase;

import org.junit.Test;

public class motorcycleTest extends TestCase {

    @Test
    public void testDrive(){
        motorcycle m = new motorcycle();
        m.drive();

        assertEquals(0.5,m.fule,0.01);
        assertEquals("Red",m.color.name);
    }

}