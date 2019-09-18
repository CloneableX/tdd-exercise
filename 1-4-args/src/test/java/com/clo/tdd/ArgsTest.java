package com.clo.tdd;

import org.junit.Ignore;
import org.junit.Test;

/**
 * com.clo.tdd.ArgsTest
 *
 * @author Cloneable
 * @date 2019/9/18 23:04:18
 * @description
 */
public class ArgsTest {
    @Test
    @Ignore
    public void should_get_arg_value_when_give_arg_name() {
        Args args = new Args("l:bool", "-l");
        args.queryValue("l");
    }
}
