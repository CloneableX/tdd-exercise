package com.clo.tdd;

import java.util.HashMap;

/**
 * com.clo.tdd.Command
 *
 * @author Cloneable
 * @date 2019/9/4 22:43:04
 * @description desc command
 */
public class Command {
    private final HashMap<String, String> argMap;

    public Command(String command) {
        argMap = new HashMap<>();
        String[] args = command.split(" ");
        for (int i = 0; i < args.length; i++) {
            String flag = args[i];
            if (isFlag(flag)) {
                argMap.put(flag.substring(1), i + 1 == args.length || isFlag(args[i + 1]) ? null : args[i + 1]);
            }

        }
    }

    int size() {
        return argMap.size();
    }

    private boolean isFlag(String flag) {
        return flag.contains("-");
    }

    String queryValue(String flag) {
        return argMap.get(flag);
    }
}
