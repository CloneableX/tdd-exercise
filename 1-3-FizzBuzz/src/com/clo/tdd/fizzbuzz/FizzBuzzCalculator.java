package com.clo.tdd.fizzbuzz;

/**
 * com.clo.tdd.fizzbuzz.FizzBuzzCalculator
 *
 * @author Cloneable
 * @date 2019/8/16 23:45:16
 * @description
 */
public class FizzBuzzCalculator {

    private final int num;

    public FizzBuzzCalculator(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        if (dividedByValue(3) == 0 && dividedByValue(5) == 0) return "fizzbuzz";
        else if (dividedByValue(3) == 0) return "fizz";
        else if (dividedByValue(5) == 0) return "buzz";
        return String.valueOf(num);
    }

    private int dividedByValue(int i) {
        return num % i;
    }
}
