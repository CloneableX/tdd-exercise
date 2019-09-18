package com.clo.tdd;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.ArgsTest
 *
 * @author Cloneable
 * @date 2019/9/18 23:04:18
 * @description unit test for Args
 */
public class ArgsTest {
    @Test
    @Ignore
    public void should_get_arg_value_when_give_arg_name() {
        Schema schema = new Schema("l:bool;p:int;d:string");
        Command command = new Command("-l -p 8080 -d /usr/logs");
        Args args = new Args(schema, command);
        assertThat(args.queryValue("l"), is(Boolean.TRUE));
    }
}
