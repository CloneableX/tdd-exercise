package com.clo.tdd.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * com.clo.tdd.fizzbuzz.FizzBuzzCaculatorTest
 *
 * @author Cloneable
 * @date 2019/8/14 23:05:14
 * @description
 */
public class FizzBuzzCaculatorTest {
    @Test
    public void should_return_value_if_normal_value() {
        compareFizzBuzz(1, "1");
    }


    @Test
    public void should_return_fizz_if_divided_by_3() {
        compareFizzBuzz(3, "fizz");
    }

    @Test
    public void should_return_buzz_if_divided_by_5() {
        compareFizzBuzz(5, "buzz");
    }

    @Test
    public void should_return_fizzbuzz_if_divided_by_3_and_5() {
        compareFizzBuzz(15, "fizzbuzz");
    }

    private void compareFizzBuzz(int i, String s) {
        Assert.assertEquals(new FizzBuzzCaculator(i).say(), s);
    }
}
