package com.clo.tdd;

/**
 * com.clo.tdd.Label
 *
 * @author Cloneable
 * @date 2019/9/19 22:43:19
 * @description
 */
public class Label {

    public final String name;
    public final String type;

    public Label(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Object parseValue(String value) {
        return Boolean.TRUE;
    }
}
