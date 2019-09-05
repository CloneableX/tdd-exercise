package com.clo.tdd;

import java.util.Arrays;

/**
 * com.clo.tdd.Command
 *
 * @author Cloneable
 * @date 2019/9/4 22:43:04
 * @description desc command
 */
public class Command {
    private final String[] args;

    public Command(String command) {
        args = command.split(" ");
    }

    public int size() {
        return Arrays.stream(args).filter(arg -> isFlag(arg)).toArray().length;
    }

    private boolean isFlag(String flag) {
        return flag.indexOf("-") > -1;
    }
}
