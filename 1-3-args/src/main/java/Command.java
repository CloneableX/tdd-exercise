package com.clo.tdd;

import java.util.Arrays;
import java.util.HashMap;

/**
 * com.clo.tdd.Command
 *
 * @author Cloneable
 * @date 2019/9/4 22:43:04
 * @description desc command
 */
public class Command {
    private final String[] args;
    private final HashMap argMap = new HashMap();

    public Command(String command) {
        args = command.split(" ");
        for (int i = 0; i < args.length; i += 2) {
            String value = null;
            if (isFlag(args[i])) {
                value = args[i+1];
            }

            argMap.put(args[i],value);
        }
    }

    public int size() {
        return argMap.size();
    }

    private boolean isFlag(String flag) {
        return flag.indexOf("-") > -1;
    }
}
