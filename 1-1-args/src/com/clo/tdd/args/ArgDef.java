package com.clo.tdd.args;

/**
 * com.clo.tdd.args.ArgDef
 *
 * @author Cloneable
 * @date 2019/8/22 21:33:22
 * @description
 */
public class ArgDef {
    public final String label;
    public final String type;

    public ArgDef(String label, String type) {
        this.label = label;
        this.type = type;
    }

    public ArgDef(String schema) {
        String[] def = schema.split(":");
        label = def[0];
        type = def[1];
    }
}
