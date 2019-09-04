package com.clo.tdd;

/**
 * com.clo.tdd.Schema
 *
 * @author Cloneable
 * @date 2019/9/4 22:37:04
 * @description schema desc argument definition
 */
public class Schema {
    private String schema;

    public Schema(String schema) {
        this.schema = schema;
    }

    public int size() {
        return schema.split(";").length;
    }
}
