package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongMultCalculatorTest extends BaseTest {

    @Test(description = "test 2 * 2")
    public void testTwoMultipleTwo() {
        long result = calculator.mult(2,2);
        Assert.assertEquals(result, 4, "Invalid result of mult operation!");
    }

    @Test(description = "test 2 * 0")
    public void testTwoMultipleZero() {
        long result = calculator.mult(2,0);
        Assert.assertEquals(result, 0, "Invalid result of mult operation!");
    }
}