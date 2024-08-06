package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTest {
    @Test
    public void testAdd() {             // Método de teste para add()
        Main main = new Main();
        int result = main.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {        // Método de teste para subtract()
        Main main = new Main();
        int result = main.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiply() {        // Método de teste para multiply()
        Main main = new Main();
        int result = main.multiply(2, 3);
        assertEquals(6, result);
    }
}