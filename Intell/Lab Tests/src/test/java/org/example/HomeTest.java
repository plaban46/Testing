package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HomeTest {

    @Test
    public void getString() {
        Home home = new Home();
        home.setString("My Home");

        assertEquals("My Home", home.getString());
    }
}