package com.epam.cdp.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CosCalculatorTest extends BaseTest {

    @Test
    public void testCosZero() {
        double result = calculator.cos(0.0);
        assertEquals("Invalid result of cos operation!", 1.0, result, epsilon);
    }

    @Test
    public void testCosPiDivideTwo() {
        double result = calculator.cos(Math.PI / 2.0);
        assertEquals("Invalid result of cos operation!", 0.0, result, epsilon);
    }
}
