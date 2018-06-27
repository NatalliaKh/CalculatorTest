package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongDivCalculatorTest extends BaseTest {

    @Test(description = "test 4 / 2")
    public void testFourDivideTwo() {
        long result = calculator.div(4,2);
        Assert.assertEquals(result, 2, "Invalid result of div operation!");
    }

    @Test(description = "test 2 / 0",
            expectedExceptions = ArithmeticException.class)
    public void testTwoDivideZero() {
        long result = calculator.div(2,0);
    }
}