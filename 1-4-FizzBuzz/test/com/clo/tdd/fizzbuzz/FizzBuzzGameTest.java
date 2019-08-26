package com.clo.tdd.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.fizzbuzz.FizzBuzzGameTest
 *
 * @author Cloneable
 * @date 2019/8/17 22:51:17
 * @description
 */
public class FizzBuzzGameTest {
    @Test
    public void should_get_normal_num_if_give_normal_num() {
        compareResult(new FizzBuzzGame(1).say(), "1");
    }

    @Test
    public void should_get_fizz_if_num_divided_3() {
        compareResult(new FizzBuzzGame(3).say(), "fizz");
    }

    @Test
    public void should_get_buzz_if_num_divided_5() {
        compareResult(new FizzBuzzGame(5).say(), "buzz");
    }

    @Test
    public void should_get_fizzbuzz_if_num_divided_3_and_5() {
        compareResult(new FizzBuzzGame(15).say(), "fizzbuzz");
    }

    private void compareResult(String result, String expect) {
        assertThat(result, is(expect));
    }

}
