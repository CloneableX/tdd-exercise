package com.clo.tdd;

/**
 * com.clo.tdd.ArgDef
 *
 * @author Cloneable
 * @date 2019/9/4 23:06:04
 * @description the definition of argument
 */
public class ArgDef {
    public final String flag;
    public final String type;
    public Object defaultValue;

    public ArgDef(String argDef) {
        String[] argDefs = argDef.split(":");
        flag = argDefs[0];
        type = argDefs[1];
        if (argDefs.length > 2) {
            defaultValue = parseValue(argDefs[2]);
        }
    }

    public Object parseValue(String value) {
        if (value == null || "".equals(value)) {
            return defaultValue;
        }
        if ("bool".equals(type)) {
            return new Boolean(value);
        } else if ("int".equals(type)) {
            return new Integer(value);
        }
        return value;
    }
}
