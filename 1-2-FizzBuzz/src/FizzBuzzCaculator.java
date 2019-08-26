package com.clo.tdd.fizzbuzz;

/**
 * com.clo.tdd.fizzbuzz.FizzBuzzCaculator
 *
 * @author Cloneable
 * @date 2019/8/14 23:11:14
 * @description
 */
public class FizzBuzzCaculator {
    private final int value;

    public FizzBuzzCaculator(int value) {
        this.value = value;
    }

    public String say() {
        if (dividedByNum(3) && dividedByNum(5)) {
            return "fizzbuzz";
        } else if (dividedByNum(3)) {
            return "fizz";
        } else if (dividedByNum(5)) {
            return "buzz";
        }
        return String.valueOf(this.value);
    }

    private boolean dividedByNum(int num) {
        return this.value % num == 0;
    }
}
