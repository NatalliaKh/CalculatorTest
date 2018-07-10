package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongMultCalculatorTest extends BaseTest {

    @DataProvider(name = "valuesForMultTest")
    public Object[][] valuesForMult() {
        return new Object[][]{
                {2, 2, 4},
                {2, 0, 0},
        };
    }

    @Test(dataProvider = "valuesForMultTest", description = "test mult", groups = "Long")
    public void  testMult(long a, long b, long expectedValue) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(expectedValue, result, "Invalid result of mult operation!");
    }

}