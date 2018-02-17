package com.lasalle.mdpa.fizzbuzz;

import com.lasalle.mdpa.fizzbuzz.manager.FizzBuzzManager;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private FizzBuzzManager fizzBuzzManager;

    @BeforeClass
    public void setupManager() throws Exception {
        fizzBuzzManager = new FizzBuzzManager();
    }

    @Test
    public void checkOneIsCorrect() throws Exception {
        int result = fizzBuzzManager.TestNumber(1);
        assertEquals(1, result);
    }
}