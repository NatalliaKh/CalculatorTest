package com.epam.cdp.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SqrtCalculatorTest extends BaseTest {

    @Test
    public void testPositiveSqrt() {
        double result = calculator.sqrt(4);
        assertEquals("Invalid result of sqrt operation!", 2.0, result, epsilon);
    }

    @Test(expected = Exception.class)
    public void testExceptionSqrt() {
        calculator.sqrt(-4);
    }
}
