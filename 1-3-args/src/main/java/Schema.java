package com.clo.tdd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * com.clo.tdd.Schema
 *
 * @author Cloneable
 * @date 2019/9/4 22:37:04
 * @description schemas desc argument definition
 */
public class Schema {
    public final List<ArgDef> schemas;

    public Schema(String schemas) {
        this.schemas = Arrays.stream(schemas.split(";")).map(ArgDef::new).collect(Collectors.toList());
    }

    public int size() {
        return schemas.size();
    }
}
