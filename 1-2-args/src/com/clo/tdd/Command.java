package com.clo.tdd;

import java.util.HashMap;
import java.util.Map;

/**
 * com.clo.tdd.Command
 *
 * @author Cloneable
 * @date 2019/8/28 22:58:28
 * @description
 */
public class Command {
    private Map<String, Object> commandMap;

    public Command(String command, Schema schema) {
        this.commandMap = new HashMap<>();
        String[] commands = command.split(" ");
        for (int i = 0; i < commands.length; i++) {
            if (isLabel(commands[i])) {
                String labelName = commands[i].substring(1);
                String value = commands[i + 1];
                commandMap.put(labelName, schema.queryLabel(labelName).parseValue(isLabel(value) ? null : value));
            }
        }
    }

    private boolean isLabel(String command) {
        return command.indexOf("-") > -1;
    }

    public int size() {
        return commandMap.size();
    }

    public Object queryValue(String labelName) {
        return commandMap.get(labelName);
    }
}
