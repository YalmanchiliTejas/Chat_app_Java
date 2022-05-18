package com.example.demo.FreeMessage;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class ChatMessage {
 // Generates the if for each of the chats
    @Id
    @SequenceGenerator(
            name = "sequence_generator",
            sequenceName = "sequence_generator",
            allocationSize =  1
    )
     @GeneratedValue(
             strategy = GenerationType.SEQUENCE,
             generator = "sequence_generator"


     )

     private long id;
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
