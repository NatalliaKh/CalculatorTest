package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleDivCalculatorTest extends BaseTest {
    private final double epsilon = 0.0000000001;

    @Test(description = "test 5.06 / -2.3", groups = "Double")
    public void testPositiveDivNegarive() {
        double result = calculator.div(5.06,-2.3);
        Assert.assertEquals(result,  -2.2, epsilon,"Invalid result of div operation!");
    }

    @Test(description = "test 2.2 / 0", expectedExceptions = ArithmeticException.class, groups = "Double")
    public void testDivByZero() {
        double result = calculator.div(2.2,0);
    }
}