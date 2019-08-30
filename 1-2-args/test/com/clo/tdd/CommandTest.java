package com.clo.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.CommandTest
 *
 * @author Cloneable
 * @date 2019/8/28 22:59:28
 * @description
 */
public class CommandTest {

    private Command command;
    private Command commandWithDefault;
    private final Schema schema = new Schema("l:bool;p:int;d:string;");

    @Before
    public void setUp() {
        command = new Command("-l true -p 8080 -d /usr/logs", schema);
        commandWithDefault = new Command("-l -p 8080 -d /usr/logs", schema);
    }

    @Test
    public void should_get_size_when_give_command_str() {
        assertThat(command.size(), is(3));
        assertThat(commandWithDefault.size(), is(3));
    }

    @Test
    public void should_get_value_when_give_command_label() {
        assertThat(command.queryValue("l"), is(Boolean.TRUE));
        assertThat(command.queryValue("p"), is(8080));
        assertThat(command.queryValue("d"), is("/usr/logs"));

        assertThat(commandWithDefault.queryValue("l"), is(Boolean.FALSE));
        assertThat(commandWithDefault.queryValue("p"), is(8080));
        assertThat(commandWithDefault.queryValue("d"), is("/usr/logs"));
    }
}
