package com.example.demo;

import javax.persistence.*;
import java.util.Date;
import java.util.Queue;
import java.util.UUID;

@Entity
@Table(name = "Messages")
public class Message {
    @Id
    @SequenceGenerator(
            sequenceName = "chat_id",
            name = "chat_id",
            initialValue = 5
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "chat_id"
    )
 private UUID chat_id;
private String content;
@OneToOne
@JoinColumn(name = "author")
private User receiver;
@OneToOne
@JoinColumn(name = "sender")
private User sender;
private Date time;

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Message() {
    }

    public Message(String content, User receiver, User sender, Date time) {
        this.content = content;
        this.receiver = receiver;
        this.sender = sender;
        this.time = time;
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

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }
}

