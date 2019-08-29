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
}
