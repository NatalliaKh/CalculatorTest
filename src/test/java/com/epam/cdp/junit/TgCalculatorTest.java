package com.epam.cdp.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TgCalculatorTest extends BaseTest {

    @Test
    public void testTgOfZero() {
        double result = calculator.tg(0);
        assertEquals("Invalid result of tg operation!", 0.0, result, epsilon);
    }

    @Test
    public void testTgPiDivideFour() {
        double result = calculator.tg(Math.PI / 4.0);
        assertEquals("Invalid result of tg operation!", 1.0, result, epsilon);
    }
}

