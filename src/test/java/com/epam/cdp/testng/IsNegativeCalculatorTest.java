package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeCalculatorTest extends BaseTest {

    @DataProvider(name = "valuesForNegativeTest")
    public Object[][] valuesForNegative() {
        return new Object[][] {
                {0, false},
                {1, false},
                {-1, true}
        };
    }

    @Test(dataProvider = "valuesForNegativeTest", description = "test negative")
    public void  testIsNegative(long a, boolean expectedValue) {
        boolean result = calculator.isNegative(a);
        Assert.assertEquals(expectedValue, result, "Invalid result of isNegative operation!");
    }

}

