package com.clo.tdd;

import java.util.Arrays;
import java.util.List;

/**
 * com.clo.tdd.Schema
 *
 * @author Cloneable
 * @date 2019/9/4 22:37:04
 * @description schemas desc argument definition
 */
public class Schema {
    public final List<String> schemas;

    public Schema(String schemas) {
        this.schemas = Arrays.asList(schemas.split(";"));
    }

    public int size() {
        return schemas.size();
    }
}
