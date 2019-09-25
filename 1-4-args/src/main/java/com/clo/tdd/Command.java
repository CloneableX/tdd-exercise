package com.clo.tdd;

import java.util.Arrays;

/**
 * com.clo.tdd.Command
 *
 * @author Cloneable
 * @date 2019/9/18 23:14:18
 * @description
 */
public class Command {
    private String[] commandPairs;

    public Command(String command) {
        this.commandPairs = command.split(" ");
    }

    public Object queryValue(String label) {
        return null;
    }

    public int size() {
        return Arrays.stream(commandPairs).filter(commandStr -> commandStr.contains("-")).toArray().length;
    }
}
