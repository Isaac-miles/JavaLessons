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
}
