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
}
