package com.clo.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.ArgDefTest
 *
 * @author Cloneable
 * @date 2019/9/11 22:51:11
 * @description test unit for ArgDef
 */
public class ArgDefTest {
    @Test
    public void should_get_arg_def_when_give_schema_def_string() {
        ArgDef argDef = new ArgDef("l:bool");
        assertNotNull(argDef);
        assertThat(argDef.flag, is("l"));
        assertThat(argDef.type, is("bool"));
    }

    @Test
    public void should_get_arg_default_value_when_give_schema_def_string_with_default() {
        ArgDef argDef = new ArgDef("l:bool:true");
        assertThat(argDef.defaultValue, is(Boolean.TRUE));
    }

    @Test
    public void should_arg_def_parse_boolean_value_when_give_boolean_string() {
        ArgDef argDef = new ArgDef("l:bool");
        assertThat(argDef.parseValue("true"), is(Boolean.TRUE));
    }

    @Test
    public void should_get_int_value_when_give_int_type_arg_def() {
        ArgDef argDef = new ArgDef("l:int");
        assertThat(argDef.parseValue("8080"), is(8080));
    }

    @Test
    public void should_get_string_value_when_give_string_type_arg_def() {
        ArgDef argDef = new ArgDef("l:string");
        assertThat(argDef.parseValue("/usr/logs"), is("/usr/logs"));
    }
}
