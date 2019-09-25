package com.clo.tdd;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.CommandTest
 *
 * @author Cloneable
 * @date 2019/9/25 22:23:25
 * @description
 */
public class CommandTest {
    @Test
    @Ignore
    public void should_get_command_when_give_command_string() {
        Command command = new Command("-l -p 8080 -d /usr/logs");
        assertThat(command.queryValue("l"), is(Boolean.TRUE));
    }
}
