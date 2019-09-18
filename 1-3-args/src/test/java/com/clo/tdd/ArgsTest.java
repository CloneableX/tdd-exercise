package com.clo.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.ArgsTest
 *
 * @author Cloneable
 * @date 2019/9/4 22:36:04
 * @description unit test for Args
 */
public class ArgsTest {
    private com.clo.tdd.Args args;

    @Before
    public void setUp() {
        Schema schema = new Schema("l:bool;p:int;d:string;u:string:cloneable");
        com.clo.tdd.Command command = new com.clo.tdd.Command("-l -p 8080 -d /usr/logs -u");
        args = new com.clo.tdd.Args(schema, command);
    }

    @Test
    public void should_get_value_when_give_schema_command_flag() {
        assertThat(args.queryValue("l"), is(Boolean.FALSE));
        assertThat(args.queryValue("p"), is(8080));
        assertThat(args.queryValue("d"), is("/usr/logs"));
        assertThat(args.queryValue("u"), is("cloneable"));
    }


    @Test
    public void should_get_arg_size_when_give_schema_and_command() {
        assertThat(args.size(), is(4));
    }
}
