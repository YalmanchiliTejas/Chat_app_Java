package com.example.demo;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.UUID;

public class ChatRoom {


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
    private Message message;
}
