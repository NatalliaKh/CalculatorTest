package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LongSubCalculatorTest extends BaseTest {

    @DataProvider(name = "valuesForSubTest")
    public Object[][] valuesForSub() {
        return new Object[][]{
                {2, 1, 1},
                {0, 0, 0},
        };
    }

    @Test(dataProvider = "valuesForSubTest", description = "test sub", groups = "Long")
    public void  testSub(long a, long b, long expectedValue) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sub operation!");
    }

}
