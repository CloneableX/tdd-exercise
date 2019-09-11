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
    public String defaultValue;

    public ArgDef(String argDef) {
        String[] argDefs = argDef.split(":");
        flag = argDefs[0];
        type = argDefs[1];
        if (argDefs.length > 2) {
            defaultValue = argDefs[2];
        }
    }

    public Object parseValue(String value) {
        if ("bool".equals(type)) {
            return new Boolean(value);
        }
        return null;
    }
}
