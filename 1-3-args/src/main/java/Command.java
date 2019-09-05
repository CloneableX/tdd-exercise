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
    private String command;

    public Command(String command) {
        this.command = command;
    }

    public int size() {
        String[] args = command.split(" ");
        return Arrays.stream(args).filter(arg -> arg.indexOf("-") > -1).toArray().length;
    }
}
