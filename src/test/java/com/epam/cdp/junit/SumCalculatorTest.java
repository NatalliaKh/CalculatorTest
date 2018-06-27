package com.epam.cdp.junit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SumCalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
        System.out.println("Setup preconditions");
    }

    @After
    public void after() {
        System.out.println("Setup postconditions");
    }
}
