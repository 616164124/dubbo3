package com.mk.result;

import java.io.Serializable;

/**
 * 服务之间的交互
 */
public class BaseBean implements Serializable {
    private String type;
    private Object object;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
