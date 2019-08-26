package com.clo.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.ArgsTest
 *
 * @author Cloneable
 * @date 2019/8/26 23:26:26
 * @description
 */
public class ArgsTest {
    @Test
    public void should_get_arg_value_if_give_arg_name_when_set_args_schema_and_command() {
        Args args = new Args("l:bool;p:int;d:string", "-l -p 8080 -d /usr/logs");
        assertThat(args.getValue("l"), is(Boolean.TRUE));
    }
}
