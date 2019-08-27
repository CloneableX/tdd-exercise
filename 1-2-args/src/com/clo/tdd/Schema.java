package com.clo.tdd;

import java.util.*;

/**
 * com.clo.tdd.Schema
 *
 * @author Cloneable
 * @date 2019/8/27 22:52:27
 * @description
 */
public class Schema {
    public final List<Label> labels;

    public Schema(String schema) {
        labels = new ArrayList<>();
        Arrays.stream(schema.split(";")).forEach(schemaStr -> labels.add(new Label(schemaStr)));
    }

    public int size() {
        return labels.size();
    }

}
