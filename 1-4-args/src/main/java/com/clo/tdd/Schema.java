package com.clo.tdd;

/**
 * com.clo.tdd.Schema
 *
 * @author Cloneable
 * @date 2019/9/18 23:13:18
 * @description
 */
public class Schema {
    private String schema;

    public Schema(String schema) {
        this.schema = schema;
    }

    public Label queryArg(String name) {
        return null;
    }

    public int size() {
        return schema.split(";").length;
    }
}
