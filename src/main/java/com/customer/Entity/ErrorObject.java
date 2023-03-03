package com.customer.Entity;

public class ErrorObject {

    private String message;
    private long timeStamp;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public ErrorObject(String message, long timeStamp) {
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public ErrorObject(){

    }
}
