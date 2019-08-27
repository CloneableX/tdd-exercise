package com.clo.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.SchemaTest
 *
 * @author Cloneable
 * @date 2019/8/27 23:02:27
 * @description
 */
public class SchemaTest {

    private Schema schema;

    @Before
    public void setUp() {
        schema = new Schema("l:bool;p:int;d:string");
    }

    @Test
    public void should_get_size_when_give_schema_str() {
        assertThat(schema.size(), is(3));
    }

    @Test
    public void should_get_schema_map_when_give_schema_str() {
        assertThat(schema.labels.size(), is(3));
    }
}
