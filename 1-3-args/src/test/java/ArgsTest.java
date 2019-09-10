package com.clo.tdd;

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
    @Test
    @Ignore
    public void should_get_value_when_give_schema_command_flag() {
        Schema schema = new Schema("l:bool;p:int");
        Command command = new Command("-l -p 8080 -d /usr/logs");
        Args args = new Args(schema, command);
        args.queryValue("l");
    }
}
