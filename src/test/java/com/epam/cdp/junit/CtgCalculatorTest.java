package com.epam.cdp.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CtgCalculatorTest extends BaseTest {

    @Test
    public void testCtgPiDivideFour() {
        double result = calculator.ctg(Math.PI / 4.0);
        assertEquals("Invalid result of ctg operation!", 1.0, result, epsilon);
    }

    @Test
    public void testCtgPiDivideTwo() {
        double result = calculator.ctg(Math.PI /2.0);
        assertEquals("Invalid result of ctg operation!", 0.0, result, epsilon);
    }
}