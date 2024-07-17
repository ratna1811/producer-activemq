package com.learning.producer_activemq.model;

import java.io.Serializable;

public class SystemMessages implements Serializable {
    private static final long serialVersionID = 1L;

    private String source;
    private String message;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SystemMessages [source=" + source + ", message=" + message + "]";
    }

}
