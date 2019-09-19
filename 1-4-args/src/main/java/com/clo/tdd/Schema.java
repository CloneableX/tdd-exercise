package com.clo.tdd;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * com.clo.tdd.Schema
 *
 * @author Cloneable
 * @date 2019/9/18 23:13:18
 * @description
 */
public class Schema {
    private final ArrayList<Label> labelList = new ArrayList<>();

    public Schema(String schema) {
        String[] labels = schema.split(";");
        Arrays.stream(labels).map(label -> label.split(":")).map(label -> new Label(label[0], label[1])).forEach(labelList::add);
    }

    public Label queryArg(String name) {
        return labelList.stream().filter(label -> label.name.equals(name)).findFirst().get();
    }

    public int size() {
        return labelList.size();
    }
}
