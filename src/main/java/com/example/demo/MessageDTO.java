package com.example.demo;

public class MessageDTO {

    private String message;

    private long userIdOne;
    private long userIdTwo;


    public MessageDTO() {

    }
    public MessageDTO(String message, long userIdOne, long userIdTwo) {
        this.message = message;
        this.userIdOne = userIdOne;
        this.userIdTwo = userIdTwo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getUserIdOne() {
        return userIdOne;
    }

    public void setUserIdOne(long userIdOne) {
        this.userIdOne = userIdOne;
    }

    public long getUserIdTwo() {
        return userIdTwo;
    }

    public void setUserIdTwo(long userIdTwo) {
        this.userIdTwo = userIdTwo;
    }
}
