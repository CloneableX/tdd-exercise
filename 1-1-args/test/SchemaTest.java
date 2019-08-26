package com.clo.tdd.args;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.args.SchemaTest
 *
 * @author Cloneable
 * @date 2019/8/22 21:06:22
 * @description
 */
public class SchemaTest {

    private Schema schema;

    @Before
    public void setUp() {
        String schemaStr = "l:boolean;p:int;d:string";
        schema = new Schema(schemaStr);
    }

    @Test
    public void should_get_schema_size_when_give_schema_string() {
        assertThat(schema.size(), is(3));
    }

    @Test
    public void should_get_schema_list_when_give_schema_string() {
        assertThat(schema.argDefs.size(), is(3));
    }

    @Test
    public void should_get_type_when_give_label() {
        assertThat(schema.getArgDef("l").type, is("boolean"));
    }

    @Test
    public void should_succ() {
        System.out.println(f(7));
    }

    public int f(int n) {
        if(n == 1) {return 1;}
        int result = f(n - 1) + 1;
        return result;
    }

}
