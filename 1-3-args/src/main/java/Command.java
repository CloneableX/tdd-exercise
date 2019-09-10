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
    private final HashMap<String, String> argMap = new HashMap();

    public Command(String command) {
        String[] args = command.split(" ");
        for (int i = 0; i < args.length; i++) {
            String flag = args[i];
            if (isFlag(flag)) {
                argMap.put(flag.substring(1), isFlag(args[i + 1]) ? null : args[i + 1]);
            }

        }
    }

    public int size() {
        return argMap.size();
    }

    private boolean isFlag(String flag) {
        return flag.indexOf("-") > -1;
    }

    public String queryValue(String flag) {
        return argMap.get(flag);
    }
}
