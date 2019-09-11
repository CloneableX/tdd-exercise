package com.clo.tdd;

import java.util.HashMap;

/**
 * com.clo.tdd.Args
 *
 * @author Cloneable
 * @date 2019/9/4 22:42:04
 * @description
 */
public class Args {
    private final Schema schema;
    private final HashMap<String, String> args;
    private Command command;

    public Args(Schema schema, Command command) {
        this.schema = schema;
        this.command = command;
        this.args = command.argMap;
    }

    public Object queryValue(String flag) {
        return null;
    }

    public int size() {
        return args.size();
    }
}
