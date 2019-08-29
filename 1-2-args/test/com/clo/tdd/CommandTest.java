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
    public void should_get_label_value_map_size_when_give_command_str() {
        assertThat(command.commandMap.size(), is(3));
        assertThat(commandWithDefault.commandMap.size(), is(3));
    }

    @Test
    public void should_get_value_when_give_command_label() {
        assertThat(command.commandMap.get("l"), is(Boolean.TRUE));
        assertThat(command.commandMap.get("p"), is(8080));
        assertThat(command.commandMap.get("d"), is("/usr/logs"));

        assertThat(commandWithDefault.commandMap.get("l"), is(Boolean.FALSE));
        assertThat(commandWithDefault.commandMap.get("p"), is(8080));
        assertThat(commandWithDefault.commandMap.get("d"), is("/usr/logs"));
    }

    @Test
    public void should_get_boolean_value_when_give_bool_type_and_value() {
        checkValueParseResult("bool", "true", Boolean.TRUE);
    }

    @Test
    public void should_get_int_value_when_give_int_type_and_value() {
        checkValueParseResult("int", "8080", 8080);
    }


    @Test
    public void should_get_string_value_when_give_string_type_and_value() {
        checkValueParseResult("string", "/usr/logs", "/usr/logs");
    }

    @Test
    public void should_get_default_value_when_give_type_and_null_value() {
        checkValueParseResult("bool", null, Boolean.FALSE);
    }

    private void checkValueParseResult(String type, String value, Object expected) {
        assertThat(command.parseValue(type, value), is(expected));
    }
}
