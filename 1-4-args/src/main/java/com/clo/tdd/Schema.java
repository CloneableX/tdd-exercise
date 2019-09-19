package com.clo.tdd;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * com.clo.tdd.Schema
 *
 * @author Cloneable
 * @date 2019/9/18 23:13:18
 * @description
 */
public class Schema {
    private final String[] labels;
    private final ArrayList<Label> labelList = new ArrayList<>();

    public Schema(String schema) {
        labels = schema.split(";");
        for (int i = 0; i < labels.length; i++) {
            String[] label = labels[i].split(":");
            labelList.add(new Label(label[0], label[1]));
        }
    }

    public Label queryArg(String name) {
        return null;
    }

    public int size() {
        return labelList.size();
    }
}
