package com.clo.tdd;

import java.util.HashMap;
import java.util.NoSuchElementException;

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
            commandMap.put(formatLabel(label), value);
        }
    }

    private String formatLabel(String label) {
        return label.substring(label.indexOf("-") + 1);
    }

    private boolean isLabel(String commandStr) {
        return commandStr.contains("-");
    }

    public String queryValue(String label) {
        if (!commandMap.containsKey(label)) {
            throw new NoSuchElementException("command label [" + label + "] not exist");
        }
        return commandMap.get(label);
    }

    public int size() {
        return commandMap.size();
    }
}
