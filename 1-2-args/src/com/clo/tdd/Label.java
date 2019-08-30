package com.clo.tdd;

/**
 * com.clo.tdd.Label
 *
 * @author Cloneable
 * @date 2019/8/27 23:17:27
 * @description
 */
public class Label {
    public final String name;
    public final String type;

    public Label(String schemaStr) {
        String[] schemaStrs = schemaStr.split(":");
        name = schemaStrs[0];
        type = schemaStrs[1];
    }

    public Object parseValue(String value) {
        switch (type) {
            case "bool":
                return Boolean.valueOf(value);
            case "int":
                return Integer.parseInt(value);
        }
        return value;
    }
}
