package com.clo.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
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

    @Test
    public void should_get_type_when_give_label() {
        assertThat(schema.queryLabel("l").type, is("bool"));
    }

    @Test
    public void should_get_label_when_give_label_name() {
        Label label = schema.queryLabel("l");
        assertNotNull(label);
        assertThat(label.name, is("l"));
        assertThat(label.type, is("bool"));
    }
}
