package com.lasalle.mdpa.fizzbuzz;

import com.lasalle.mdpa.fizzbuzz.manager.FizzBuzzManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {

    private static FizzBuzzManager fizzBuzzManager;

    @BeforeClass
    public static void setupManager() throws Exception {
        fizzBuzzManager = new FizzBuzzManager();
    }

    @Test
    public void checkOneIsCorrect() throws Exception {
        String result = fizzBuzzManager.testNumber(1);
        assertEquals("1", result);
    }

    @Test
    public void checkTwoIsCorrect() throws Exception {
        String result = fizzBuzzManager.testNumber(2);
        assertEquals("2", result);
    }

    @Test
    public void checkThreeIsCorrect() throws Exception {
        String result = fizzBuzzManager.testNumber(3);
        assertEquals("Fizz", result);
    }
}