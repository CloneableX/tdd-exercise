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
    private final HashMap argMap = new HashMap();

    public Command(String command) {
        String[] args = command.split(" ");
        for (int i = 0; i < args.length; ) {
            String value = null;
            int step = 1;

            if (isFlag(args[i])) {
                value = args[i+1];
                step = 2;
            }

            argMap.put(args[i],value);
            i += step;
        }
    }

    public int size() {
        return argMap.size();
    }

    private boolean isFlag(String flag) {
        return flag.indexOf("-") > -1;
    }
}
