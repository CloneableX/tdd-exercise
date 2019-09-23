package com.clo.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * com.clo.tdd.LabelTest
 *
 * @author Cloneable
 * @date 2019/9/23 22:41:23
 * @description
 */
public class LabelTest {
    @Test
    public void should_parse_bool_value_when_give_bool_label() {
        Label label = new Label("l", "bool");
        assertThat(label.parseValue("true"), is(Boolean.TRUE));
        assertThat(label.parseValue("false"), is(Boolean.FALSE));
        assertThat(label.parseValue(null), is(Boolean.FALSE));
    }

    @Test
    public void should_parse_int_value_when_give_int_label() {
        Label label = new Label("p", "int");
        assertThat(label.parseValue("8080"), is(8080));
    }
}
