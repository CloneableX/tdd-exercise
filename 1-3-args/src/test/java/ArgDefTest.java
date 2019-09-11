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
        assertThat(argDef.type, is("bool"));
    }
}
