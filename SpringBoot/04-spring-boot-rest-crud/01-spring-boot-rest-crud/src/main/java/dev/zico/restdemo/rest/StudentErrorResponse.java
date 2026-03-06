package dev.zico.restdemo.rest;

import java.util.List;

public class StudentErrorResponse {
    private int staus;
    private String message;
    private long timestamp;
    public StudentErrorResponse() {}

    public StudentErrorResponse(int staus, String message, long timestamp) {
        this.staus = staus;
        this.message = message;
        this.timestamp = timestamp;
    }

    public int getStaus() {
        return staus;
    }

    public void setStaus(int staus) {
        this.staus = staus;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
