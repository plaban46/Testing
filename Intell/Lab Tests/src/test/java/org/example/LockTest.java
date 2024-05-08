package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LockTest {

    @Test
    void addition() {
        Lock lock = new Lock();
        assertEquals(5,lock.addition(2,3));
    }
}