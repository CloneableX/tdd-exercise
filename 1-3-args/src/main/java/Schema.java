package com.clo.tdd;

/**
 * com.clo.tdd.Schema
 *
 * @author Cloneable
 * @date 2019/9/4 22:37:04
 * @description schemas desc argument definition
 */
public class Schema {
    public final String[] schemas;

    public Schema(String schemas) {
        this.schemas = schemas.split(";");
    }

    public int size() {
        return schemas.length;
    }
}
