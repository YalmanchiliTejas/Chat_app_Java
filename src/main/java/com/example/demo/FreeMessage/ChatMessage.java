package com.example.demo.FreeMessage;
import java.util.Date;

public class ChatMessage {

    private String message;
    private  Status status;
    private Date timeStamp;

    public ChatMessage() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }


}
