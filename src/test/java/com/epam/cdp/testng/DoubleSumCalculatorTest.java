package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class DoubleSumCalculatorTest extends BaseTest {

    private final double epsilon = 0.0000000001;

    @DataProvider(name = "valuesForSumTest")
    public Object[][] valuesForSum() {
        return new Object[][] {
                {10.3, 23.1, 33.4},
                {10.1, -1.0, 9.1},
                {0, 0, 0},
                {-1.5, 10.9, 9.4},
                {-3.5, -4.2, -7.7}
        };
    }

    @Test(dataProvider = "valuesForSumTest", description = "test sum", groups = "Double")
    public void  testSum(double a, double b, double expectedValue) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, epsilon, "Invalid result of sum operation!");
    }
}