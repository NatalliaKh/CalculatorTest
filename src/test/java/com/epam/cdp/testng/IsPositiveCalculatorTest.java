package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveCalculatorTest extends BaseTest {

    @DataProvider(name = "valuesForPositiveTest")
    public Object[][] valuesForPositive() {
        return new Object[][] {
                {0, false},
                {1, true},
                {-1, false}
        };
    }

    @Test(dataProvider = "valuesForPositiveTest", description = "test positive")
    public void  testIsPositive(long a, boolean expectedValue) {
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result, expectedValue, "Invalid result of isPositive operation!");
    }

}
