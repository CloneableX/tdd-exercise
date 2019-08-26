package com.clo.tdd.fizzbuzz;

/**
 * com.clo.tdd.fizzbuzz.FizzBuzzGame
 *
 * @author Cloneable
 * @date 2019/8/17 22:55:17
 * @description
 */
public class FizzBuzzGame {
    private int num;

    public FizzBuzzGame(int num) {
        this.num = num;
    }

    public String say() {
        if (dividedByNum(3) && dividedByNum(5))
            return "fizzbuzz";
        else if (dividedByNum(3))
            return "fizz";
        else if (dividedByNum(5))
            return "buzz";
        return String.valueOf(num);
    }

    private boolean dividedByNum(int divideNum) {
        return num % divideNum == 0;
    }
}
