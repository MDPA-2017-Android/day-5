package com.lasalle.mdpa.fizzbuzz.manager;

public class FizzBuzzManager {

    public String testNumber(int i) {
        String result = new String("");

        if(i%3 == 0) {
            result += "Fizz";
        }

        if(i%5 == 0) {
            result += "Buzz";
        }

        if(result.isEmpty())
        {
            result = Integer.toString(i);
        }

        return result;
    }

}
