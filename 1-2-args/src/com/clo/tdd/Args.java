package com.clo.tdd;

/**
 * com.clo.tdd.Args
 *
 * @author Cloneable
 * @date 2019/8/26 23:30:26
 * @description
 */
public class Args {
    private final Schema schema;
    private final Command command;

    public Args(Schema schema, Command command) {
        this.schema = schema;
        this.command = command;
    }

    public Object getValue(String label) {
        return command.queryValue(label);
    }
}
