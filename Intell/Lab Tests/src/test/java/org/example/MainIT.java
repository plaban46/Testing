package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainIT {

    @Test
    void main() {
        Lock lock = new Lock();
        assertEquals(5,lock.addition(2,3));

        Home home = new Home();
        home.setString("My Home");

        assertEquals("My Home", home.getString());
    }
}