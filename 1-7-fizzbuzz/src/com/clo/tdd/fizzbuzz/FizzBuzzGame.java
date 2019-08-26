package com.clo.tdd.fizzbuzz;

import static java.lang.String.valueOf;

/**
 * com.clo.tdd.fizzbuzz.FizzBuzzGame
 *
 * @author Cloneable
 * @date 2019/8/19 23:36:19
 * @description
 */
public class FizzBuzzGame {
    private int num;

    public FizzBuzzGame(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        if (hasRelated(3) && hasRelated(5))
            return "fizzbuzz";
        if (hasRelated(3))
            return "fizz";
        if (hasRelated(5))
            return "buzz";
        return valueOf(num);
    }

    private boolean hasRelated(int relatedNum) {
        return num % relatedNum == 0 || valueOf(num).contains(valueOf(relatedNum));
    }
}
