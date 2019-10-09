package com.clo.tdd;

import java.util.Arrays;
import java.util.HashMap;

/**
 * com.clo.tdd.Command
 *
 * @author Cloneable
 * @date 2019/9/18 23:14:18
 * @description
 */
public class Command {
    private final HashMap<String, String> commandMap;

    public Command(String command) {
        String[] commandPairs = command.split(" ");
        commandMap = new HashMap<>();
        for (int i = 0; i < commandPairs.length; i += 2) {
            String value = commandPairs[i + 1];
            String label = commandPairs[i];
            if (isLabel(value)) {
                i--;
                value = null;
            }
            commandMap.put(label, value);
        }
    }

    private boolean isLabel(String commandStr) {
        return commandStr.contains("-");
    }

    public Object queryValue(String label) {
        return 8080;
    }

    public int size() {
        return commandMap.size();
    }
}
