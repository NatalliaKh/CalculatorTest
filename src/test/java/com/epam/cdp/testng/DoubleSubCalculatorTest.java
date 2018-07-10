package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleSubCalculatorTest extends BaseTest {
    private final double epsilon = 0.0000000001;


    @DataProvider(name = "valuesForSubTest")
    public Object[][] valuesForSub() {
        return new Object[][]{
                {2.5, 1.4, 1.1},
                {0, 0, 0},
        };
    }

    @Test(dataProvider = "valuesForSubTest", description = "test sub", groups = "Double")
    public void  testSub(double a, double b, double expectedValue) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(expectedValue, result, epsilon, "Invalid result of sub operation!");
    }
}
