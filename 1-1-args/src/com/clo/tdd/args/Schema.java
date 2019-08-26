package com.clo.tdd.args;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * com.clo.tdd.args.Schema
 *
 * @author Cloneable
 * @date 2019/8/22 20:56:22
 * @description
 */
public class Schema {
    public final List<ArgDef> argDefs;

    public Schema(String schemaStr) {
        argDefs = Arrays.stream(schemaStr.split(";")).map(schema -> new ArgDef(schema)).collect(Collectors.toList());
    }

    public int size() {
        return argDefs.size();
    }

    public ArgDef getArgDef(String label) {
        return argDefs.stream().filter(argDef -> argDef.label.equals(label)).findFirst().get();
    }
}
