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
    private String[] commandPairs;

    public Command(String command) {
        this.commandPairs = command.split(" ");
        commandMap = new HashMap<>();
        for (int i = 0; i < commandPairs.length; i += 2) {
            commandMap.put(commandPairs[i], commandPairs[i + 1]);
            if (isLabel(commandPairs[i + 1])) {
                i--;
            }
        }
    }

    private boolean isLabel(String commandStr) {
        return commandStr.contains("-");
    }

    public Object queryValue(String label) {
        return null;
    }

    public int size() {
        return commandMap.size();
    }
}
