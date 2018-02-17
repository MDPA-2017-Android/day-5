package com.lasalle.mdpa.fizzbuzz;

import com.lasalle.mdpa.fizzbuzz.manager.FizzBuzzManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

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

    @Test
    public void checkFiveIsCorrect() throws Exception {
        String result = fizzBuzzManager.testNumber(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void checkMultipleThreeIsCorrect() throws Exception {
        int finalNum = 0;
        while(finalNum < 3 || (finalNum%5 == 0))
        {
            int randomNum = ThreadLocalRandom.current().nextInt(6, 20);
            finalNum = randomNum * 3;
        }
        String result = fizzBuzzManager.testNumber(finalNum);
        assertEquals("The number " + finalNum + " should only return Fizz", "Fizz", result);
    }

    @Test
    public void checkMultipleFiveIsCorrect() throws Exception {
        int finalNum = 0;
        while(finalNum < 5 || (finalNum%3 == 0))
        {
            int randomNum = ThreadLocalRandom.current().nextInt(6, 20);
            finalNum = randomNum * 5;
        }

        String result = fizzBuzzManager.testNumber(finalNum);
        assertEquals("The number " + finalNum + " should only return Buzz", "Buzz", result);
    }

    @Test
    public void checkFifteenIsCorrect() throws Exception {
        String result = fizzBuzzManager.testNumber(15);
        assertEquals("FizzBuzz", result);
    }

}