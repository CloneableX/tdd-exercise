package com.clo.tdd;

/**
 * com.clo.tdd.Args
 *
 * @author Cloneable
 * @date 2019/9/18 23:05:18
 * @description
 */
public class Args {
    private final Schema schema;
    private final Command command;

    public Args(Schema schema, Command command) {
        this.schema = schema;
        this.command = command;
    }

    public Object queryValue(String name) {
        Label label = schema.queryArg(name);
        return label.parseValue(command.queryValue(name));
    }

    public int size() {
        return command.size();
    }
}
