package com.clo.tdd;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * com.clo.tdd.SchemaTest
 *
 * @author Cloneable
 * @date 2019/9/4 22:49:04
 * @description
 */
public class SchemaTest {
    @Test
    public void should_get_schema_size_when_give_args_definition_string() {
        Schema schema = new Schema("l:bool;p:int;d:string");
        assertThat(schema.size(), is(3));
    }

    @Test
    public void should_get_flag_and_type_when_give_args_definition_string() {
        Schema schema = new Schema("l:bool");
        assertTrue(schema.schemas.get(0) instanceof ArgDef);
    }
}
