package com.clo.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.CommandTest
 *
 * @author Cloneable
 * @date 2019/9/5 23:04:05
 * @description unit test for Command
 */
public class CommandTest {
    @Test
    public void should_get_args_size_when_give_command_string() {
        Command command = new Command("-l true -p 8080");
        assertThat(command.size(), is(2));
    }
}
