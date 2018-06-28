package com.epam.cdp.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongSubCalculatorTest extends BaseTest {

    @Test(description = "test 2 - 1", groups = "Long")
    public void testTwoMinusOne() {
        long result = calculator.sub(2,1);
        Assert.assertEquals(result, 1, "Invalid result of sub operation!");
    }

    @Test(description = "test 0 - 0", groups = "Long")
    public void testZeroMinusZero() {
        long result = calculator.sub(0,0);
        Assert.assertEquals(result, 0, "Invalid result of sub operation!");
    }
}
