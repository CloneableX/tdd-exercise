package com.clo.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.LabelTest
 *
 * @author Cloneable
 * @date 2019/8/29 22:54:29
 * @description
 */
public class LabelTest {
    @Test
    public void should_get_name_and_value_when_give_schema_string() {
        Label label = new Label("l:bool");
        assertThat(label.name, is("l"));
        assertThat(label.type, is("bool"));
    }

    @Test
    public void should_get_boolean_value_when_give_bool_type_and_value() {
        checkValueParseResult("l:bool", "true", Boolean.TRUE);
    }

    @Test
    public void should_get_int_value_when_give_int_type_and_value() {
        checkValueParseResult("p:int", "8080", 8080);
    }


    @Test
    public void should_get_string_value_when_give_string_type_and_value() {
        checkValueParseResult("s:string", "/usr/logs", "/usr/logs");
    }

    @Test
    public void should_get_default_value_when_give_type_and_null_value() {
        checkValueParseResult("l:bool", null, Boolean.FALSE);
    }

    private void checkValueParseResult(String schemaStr, String value, Object expected) {
        Label label = new Label(schemaStr);
        assertThat(label.parseValue(value), is(expected));
    }
}
