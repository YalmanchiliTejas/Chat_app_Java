package com.example.demo;

public class Message {

private String content;
private String receiver;
private String sender;


    public Message() {
    }

    public Message(String content, String receiver, String sender) {
        this.content = content;
        this.receiver = receiver;
        this.sender = sender;
    }

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

}

