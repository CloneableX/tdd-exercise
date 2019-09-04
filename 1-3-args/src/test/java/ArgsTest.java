package com.clo.tdd;

import org.junit.Test;

/**
 * com.clo.tdd.ArgsTest
 *
 * @author Cloneable
 * @date 2019/9/4 22:36:04
 * @description
 */
public class ArgsTest {
    @Test
    public void should_get_value_when_give_schema_command_flag() {
        Schema schema = new Schema("l:bool;p:int");
    }
}
