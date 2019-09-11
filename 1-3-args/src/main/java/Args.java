package com.clo.tdd;

import java.util.HashMap;
import java.util.Map;

/**
 * com.clo.tdd.Args
 *
 * @author Cloneable
 * @date 2019/9/4 22:42:04
 * @description
 */
public class Args {
    private final Schema schema;
    private final HashMap<String, Object> args;
    private Command command;

    public Args(Schema schema, Command command) {
        this.schema = schema;
        this.command = command;
        this.args = new HashMap<>();

        for (Map.Entry<String, String> entry : command.argMap.entrySet()) {
            args.put(entry.getKey(), schema.queryArgDef(entry.getKey()).parseValue(entry.getValue()));
        }
    }

    public Object queryValue(String flag) {
        return null;
    }

    public int size() {
        return args.size();
    }
}
