package com.ava.frame.core.type;

/**
 * 状态
 */
public enum Status {

    active(0), fail(1), del(2), end(3),quit(4), redo(5),done(6);

    private Integer weight;

    Status(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

}
