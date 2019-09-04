package com.clo.tdd;

/**
 * com.clo.tdd.ArgDef
 *
 * @author Cloneable
 * @date 2019/9/4 23:06:04
 * @description
 */
public class ArgDef {
    public final String flag;
    private String[] argDefs;

    public ArgDef(String argDef) {
        this.argDefs = argDef.split(":");
        flag = argDefs[0];
    }
}
