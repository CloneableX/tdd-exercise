package com.clo.tdd.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.fizzbuzz.FizzBuzzCalculatorTest
 *
 * @author Cloneable
 * @date 2019/8/16 23:25:16
 * @description
 */
public class FizzBuzzCalculatorTest {
    @Test
    public void should_return_release_num_if_get_normal_num() {
        compareResult(1, "1");
    }

    @Test
    public void should_return_fizz_if_num_divided_by_3() {
        compareResult(3, "fizz");
    }

    @Test
    public void should_return_buzz_if_num_divided_by_5() {
        compareResult(5, "buzz");
    }

    @Test
    public void should_return_fizz_buzz_if_num_divided_by_3_and_5() {
        compareResult(15, "fizzbuzz");
    }

    private void compareResult(int num, String s) {
        assertThat(new FizzBuzzCalculator(num).toString(), is(s));
    }

}
