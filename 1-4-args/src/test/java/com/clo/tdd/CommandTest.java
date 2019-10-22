package com.clo.tdd;

import org.junit.Ignore;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
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
    public void should_get_command_size_when_give_command_string() {
        Command command = new Command("-l -p 8080 -d /usr/logs");
        assertThat(command.size(), is(3));
    }

    @Test
    public void should_get_value_when_give_label_name() {
        Command command = new Command("-t -l true -p 8080 -d /usr/logs");
        assertThat(command.queryValue("p"), is("8080"));
        assertThat(command.queryValue("d"), is("/usr/logs"));
        assertThat(command.queryValue("l"), is("true"));
        assertThat(command.queryValue("t"), is(""));
    }

    @Test(expected = NoSuchElementException.class)
    public void should_get_no_such_ele_exception_when_give_not_exist_label() {
        Command command = new Command("-l true -p 8080");
        command.queryValue("t");
    }
}
