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
    public Map<String, Object> commandMap;

    public Command(String command, Schema schema) {
        String[] commands = command.split(" ");
        this.commandMap = new HashMap<>();
        for (int i = 0; i < commands.length; i++) {
            if (isLabel(commands[i])) {
                String labelName = commands[i].substring(1);
                String value = commands[i + 1];
                commandMap.put(labelName, parseValue(schema.getType(labelName), isLabel(value) ? null : value));
            }
        }
    }

    private boolean isLabel(String command) {
        return command.indexOf("-") > -1;
    }

    public int size() {
        return commandMap.size();
    }

    public Object parseValue(String type, String value) {
        switch (type) {
            case "bool":
                return new Boolean(value);
            case "int":
                return Integer.parseInt(value);
        }
        return value;
    }
}
