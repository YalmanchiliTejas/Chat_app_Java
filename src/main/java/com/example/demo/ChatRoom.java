package com.example.demo;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@Table(name = "chat_room")
public class ChatRoom {

    @Id
    String uuid;
    @OneToOne
            @JoinColumn(name = "userOneId")
    User userOne;
    @OneToOne
            @JoinColumn(name = "userTwoId")
    User userTwo;

    public ChatRoom(User userOne,User userTwo){
        this.uuid = UUID.randomUUID().toString();
        this.userOne = userOne;
        this.userTwo = userTwo;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public User getUserOne() {
        return userOne;
    }

    public void setUserOne(User userOne) {
        this.userOne = userOne;
    }

    public User getUserTwo() {
        return userTwo;
    }

    public void setUserTwo(User userTwo) {
        this.userTwo = userTwo;
    }
}
