package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveCalculatorTest extends BaseTest {

    @Test(description = "test 0")
    public void testZero() {
        boolean result = calculator.isPositive(0);
        Assert.assertTrue(result == false,"Invalid result of isPositive operation!");
    }

    @Test(description = "test 1")
    public void testOne() {
        boolean result = calculator.isPositive(1);
        Assert.assertTrue(result == true,"Invalid result of isPositive operation!");
    }

    @Test(description = "test -1")
    public void testMinusOne() {
        boolean result = calculator.isPositive(-1);
        Assert.assertTrue(result == false,"Invalid result of isPositive operation!");
    }
}
