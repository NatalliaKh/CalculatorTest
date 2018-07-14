package com.epam.cdp.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PowCalculatorTest extends BaseTest {

    @Test
    public void testPowTwoInThree() {
        double result = calculator.pow(2, 3);
        assertEquals("Invalid result of pow operation!", 8.0, result, epsilon);
    }

    @Test
    public void testPowTwoPointOneInTwoPointOne() {
        double result = calculator.pow(2, 1.5);
        assertEquals("Invalid result of pow operation!", 2.8284271247462, result, epsilon);
    }
}
