package com.clo.tdd;

import org.junit.Test;

/**
 * com.clo.tdd.SchemaTest
 *
 * @author Cloneable
 * @date 2019/9/19 22:36:19
 * @description
 */
public class SchemaTest {
    @Test
    public void should_get_arg_type_when_give_arg_name() {
        Schema schema = new Schema("l:bool;p:int;d:string");
        schema.queryArg("l");
    }
}
