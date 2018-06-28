package com.epam.cdp.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SinCalculatorTest extends BaseTest {

    @Test
    public void testSinZero() {
        double result = calculator.sin(0.0);
        assertEquals("Invalid result of sin operation!", 0.0, result, epsilon);
    }

    @Test
    public void testSinPiDivideSix() {
        double result = calculator.sin(Math.PI / 6.0);
        assertEquals("Invalid result of sin operation!", 0.5, result, epsilon);
    }
}
