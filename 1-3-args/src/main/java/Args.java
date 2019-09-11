package com.clo.tdd;

/**
 * com.clo.tdd.Args
 *
 * @author Cloneable
 * @date 2019/9/4 22:42:04
 * @description
 */
public class Args {
    private final Schema schema;
    private Command command;

    public Args(Schema schema, Command command) {
        this.schema = schema;
        this.command = command;
    }

    public Object queryValue(String flag) {
        return null;
    }

    public int size() {
        return command.size();
    }
}
