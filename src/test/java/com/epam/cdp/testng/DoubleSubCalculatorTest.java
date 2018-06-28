package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleSubCalculatorTest extends BaseTest {
    private final double epsilon = 0.0000000001;

    @Test(description = "test 2.5 - 1.4", groups = "Double")
    public void testTwoMinusOne() {
        double result = calculator.sub(2.5,1.4);
        Assert.assertTrue(Math.abs(result - 1.1) < epsilon,"Invalid result of sub operation!");
    }

    @Test(description = "test 0 - 0", groups = "Double")
    public void testZeroMinusZero() {
        double result = calculator.sub(0,0);
        Assert.assertTrue(Math.abs(result - 0) < epsilon,"Invalid result of sub operation!");
    }
}
