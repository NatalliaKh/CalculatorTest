package com.epam.cdp.testng;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class LongSumCalculatorTest extends BaseTest {

    @Test(dataProvider = "valuesForSumTest", description = "test sum", groups = "Long")
    public void  testSum(long a, long b, long expectedValue) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
    }

    @DataProvider(name = "valuesForSumTest")
    public Object[][] valuesForSum() {
        return new Object[][] {
                {10, 23, 33},
                {10, -1, 9},
                {0, 0, 0},
                {-1, 10, 9},
                {-3, -4, -7},
                {Long.MAX_VALUE, 1, Long.MIN_VALUE}
        };
    }
}
