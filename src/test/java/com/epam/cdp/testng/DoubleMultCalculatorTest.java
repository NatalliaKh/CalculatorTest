package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleMultCalculatorTest extends BaseTest {
    private final double epsilon = 0.0000000001;

    @Test(description = "test 2.5 * 2.1", groups = "Double")
    public void testTwoMultipleTwo() {
        double result = calculator.mult(2.5,2.1);
        Assert.assertTrue(Math.abs(result - 5.25) < epsilon,"Invalid result of mult operation!");
    }

    @Test(description = "test 2.5 * 0", groups = "Double")
    public void testTwoMultipleZero() {
        double result = calculator.mult(2.5,0);
        Assert.assertTrue(Math.abs(result - 0) < epsilon, "Invalid result of mult operation!");
    }
}