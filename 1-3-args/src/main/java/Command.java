package com.clo.tdd;

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
        return command.split(" ").length / 2;
    }
}
