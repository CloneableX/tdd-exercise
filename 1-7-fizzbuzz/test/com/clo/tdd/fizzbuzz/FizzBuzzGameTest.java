package com.clo.tdd.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.fizzbuzz.FizzBuzzGameTest
 *
 * @author Cloneable
 * @date 2019/8/19 23:34:19
 * @description
 */
public class FizzBuzzGameTest {
    @Test
    public void should_show_num_if_give_normal_num() {
        checkGameResult(1, "1");
    }

    @Test
    public void should_show_fizz_if_give_num_divided_by_3() {
        checkGameResult(3, "fizz");
    }


    @Test
    public void should_show_buzz_if_give_num_divided_by_5() {
        checkGameResult(5, "buzz");
    }

    @Test
    public void should_show_fizzbuzz_if_give_num_divided_by_3_and_5() {
        checkGameResult(15, "fizzbuzz");
    }

    @Test
    public void should_show_fizz_buzz_if_give_num_contains_3_or_5() {
        checkGameResult(13, "fizz");
        checkGameResult(52, "buzz");
        checkGameResult(53, "fizzbuzz");
    }

    private void checkGameResult(int num, String result) {
        assertThat(new FizzBuzzGame(num).toString(), is(result));
    }
}
