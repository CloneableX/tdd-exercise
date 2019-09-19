package com.clo.tdd;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.SchemaTest
 *
 * @author Cloneable
 * @date 2019/9/19 22:36:19
 * @description
 */
public class SchemaTest {
    @Test
    @Ignore
    public void should_get_arg_type_when_give_arg_name() {
        Schema schema = new Schema("l:bool;p:int;d:string");
        Label label = schema.queryArg("l");
        assertThat(label.type, is("bool"));
        assertThat(label.parseValue("true"), is(Boolean.TRUE));
    }

    @Test
    public void should_get_size_when_give_schema_string() {
        Schema schema = new Schema("l:bool;p:int;d:string");
        assertThat(schema.size(), is(3));
    }
}
