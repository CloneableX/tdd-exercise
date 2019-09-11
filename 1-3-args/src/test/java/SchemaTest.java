package com.clo.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

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
        Schema schema = new Schema("l:bool:false");
        ArgDef argDef = schema.schemas.get(0);
        assertNotNull(argDef);
        assertThat(argDef.flag, is("l"));
        assertThat(argDef.type, is("bool"));
        assertThat(argDef.defaultValue, is("false"));
    }

    @Test
    public void should_get_flag_and_type_and_null_default_when_give_args_definition_string() {
        Schema schema = new Schema("l:bool");
        ArgDef argDef = schema.schemas.get(0);
        assertThat(argDef.flag, is("l"));
        assertThat(argDef.type, is("bool"));
        assertNull(argDef.defaultValue);
    }

    @Test
    public void should_get_arg_def_when_give_flag() {
        Schema schema = new Schema("l:bool;p:int");
        ArgDef argDef = schema.queryArgDef("l");
        assertNotNull(argDef);
        assertThat(argDef.type, is("bool"));
    }
}
