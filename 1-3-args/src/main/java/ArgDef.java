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

    public ArgDef(String argDef) {
        String[] argDefs = argDef.split(":");
        flag = argDefs[0];
        type = argDefs[1];
    }
}
