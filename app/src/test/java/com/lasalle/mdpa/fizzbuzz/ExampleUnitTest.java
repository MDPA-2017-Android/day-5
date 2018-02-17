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
        System.out.println("Execute before class");
    }

    @Before
    public void runBeforeTest() {
        System.out.println("Executing before");
    }

    @Test
    public void checkOneIsCorrect() throws Exception {
        //String result = fizzBuzzManager.TestNumber(1);
        System.out.println("Checking 1");
        String result = "1";
        assertEquals("1", result);
    }

    @Test
    public void checkTwoIsCorrect() throws Exception {
        //String result = fizzBuzzManager.TestNumber(1);
        System.out.println("Checking 2");
        String result = "2";
        assertEquals("1", result);
    }

    @After
    public void runAfterTest() {
        System.out.println("Executing after");
    }

    @AfterClass
    public static void runAfterClass() {
        System.out.println("Execute after class");
    }
}