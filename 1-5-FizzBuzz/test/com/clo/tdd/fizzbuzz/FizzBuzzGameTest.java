package com.clo.tdd.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.fizzbuzz.FizzBuzzGameTest
 *
 * @author Cloneable
 * @date 2019/8/17 23:51:17
 * @description
 */
public class FizzBuzzGameTest {
    @Test
    public void should_get_normal_num_if_give_normal_num() {
        checkGameResult(1, "1");
        checkGameResult(2, "2");
    }

    @Test
    public void should_get_fizz_if_give_num_divisible_by_3() {
        checkGameResult(3, "fizz");
    }

    @Test
    public void should_get_buzz_if_give_num_divisible_by_5() {
        checkGameResult(5, "buzz");
    }

    @Test
    public void should_get_fizzbuzz_if_give_num_divisible_by_3_and_5() {
        checkGameResult(15, "fizzbuzz");
    }

    @Test
    public void should_get_fizz_buzz_if_give_num_contains_3_or_5() {
        checkGameResult(13, "fizz");
        checkGameResult(25, "buzz");
    }

    @Test
    public void should_get_fizzbuzz_if_give_num_contains_3_and_5() {
        checkGameResult(53, "fizzbuzz");
    }

    private void checkGameResult(int i, String s) {
        assertThat(new FizzBuzzGame(i).toString(), is(s));
    }
}
