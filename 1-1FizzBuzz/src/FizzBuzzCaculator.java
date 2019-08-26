package com.clo.tdd.fizzbuzz;

/**
 * com.clo.tdd.fizzbuzz.FizzBuzzCaculator
 *
 * @author Cloneable
 * @date 2019/8/13 22:55:13
 * @description
 */
public class FizzBuzzCaculator {
    public String fizzBuzz(int value) {
        if (value % 3 == 0 && value % 5 == 0) {
            return "fizzbuzz";
        } else if (value % 3 == 0) {
            return "fizz";
        } else if (value % 5 == 0) {
            return "buzz";
        }

        return String.valueOf(value);
    }
}
