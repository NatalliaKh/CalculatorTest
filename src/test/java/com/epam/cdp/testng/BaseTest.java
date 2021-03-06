package com.epam.cdp.testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected Calculator calculator;

    @BeforeMethod(groups = {"Long", "Double"})
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterMethod(groups = {"Long", "Double"})
    public void tearDown() {
        calculator = null;
    }
}
