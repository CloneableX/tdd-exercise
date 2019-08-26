package com.clo.tdd.fizzbuzz;

import static java.lang.String.valueOf;

/**
 * com.clo.tdd.fizzbuzz.FizzBuzzGame
 *
 * @author Cloneable
 * @date 2019/8/17 23:53:17
 * @description
 */
public class FizzBuzzGame {
    private int rowNumber;

    public FizzBuzzGame(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    @Override
    public String toString() {
        if (isDivisible(3) && isDivisible(5))
            return "fizzbuzz";
        if (isDivisible(3))
            return "fizz";
        if (isDivisible(5))
            return "buzz";
        return valueOf(rowNumber);
    }

    private boolean isDivisible(int i) {
        return rowNumber % i == 0 || valueOf(rowNumber).contains(valueOf(i));
    }
}
