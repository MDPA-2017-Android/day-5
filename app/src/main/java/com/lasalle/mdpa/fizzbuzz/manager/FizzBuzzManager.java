package com.lasalle.mdpa.fizzbuzz.manager;

public class FizzBuzzManager {

    public String testNumber(int i) {
        if(i%3 == 0) {
            return "Fizz";
        }

        if(i%5 == 0) {
            return "Buzz";
        }
        return Integer.toString(i);
    }

}
