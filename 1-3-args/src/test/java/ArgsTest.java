package com.clo.tdd;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * com.clo.tdd.ArgsTest
 *
 * @author Cloneable
 * @date 2019/9/4 22:36:04
 * @description unit test for Args
 */
public class ArgsTest {
    private Args args;

    @Before
    public void setUp() {
        Schema schema = new Schema("l:bool;p:int");
        Command command = new Command("-l -p 8080 -d /usr/logs");
        args = new Args(schema, command);
    }

    @Test
    @Ignore
    public void should_get_value_when_give_schema_command_flag() {
        args.queryValue("l");
    }


    @Test
    public void should_get_arg_size_when_give_schema_and_command() {

    }
}
