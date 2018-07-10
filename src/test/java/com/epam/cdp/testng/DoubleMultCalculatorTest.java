package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleMultCalculatorTest extends BaseTest {
    private final double epsilon = 0.0000000001;

    @DataProvider(name = "valuesForMultTest")
    public Object[][] valuesForMult() {
        return new Object[][]{
                {2.5, 2.1, 5.25},
                {2.5, 0, 0},

        };
    }

    @Test(dataProvider = "valuesForMultTest", description = "test mult", groups = "Double")
    public void  testMult(double a, double b, double expectedValue) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(expectedValue, result, epsilon, "Invalid result of mult operation!");
    }
}