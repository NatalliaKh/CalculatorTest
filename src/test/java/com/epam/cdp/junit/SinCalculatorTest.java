package com.epam.cdp.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SinCalculatorTest extends BaseTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0.0, 0.0 }, { Math.PI / 6.0, 0.5 }
        });
    }

    private double fInput;

    private double fExpected;

    public SinCalculatorTest(double input, double expected){
        this.fInput = input;
        this.fExpected = expected;

    }

    @Test
    public void testSin() {
        double result = calculator.sin(fInput);
        assertEquals("Invalid result of sin operation!", fExpected, result, epsilon);
    }
}
