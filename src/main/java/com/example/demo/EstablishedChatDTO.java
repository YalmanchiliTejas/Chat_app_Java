package com.example.demo;

public class EstablishedChatDTO {

    private String roomId;
    private String userOne;
    private String userTwo;


    public EstablishedChatDTO() {
    }
    public EstablishedChatDTO(String roomId, String userOne, String userTwo) {
        this.roomId = roomId;
        this.userOne = userOne;
        this.userTwo = userTwo;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getUserOne() {
        return userOne;
    }

    public void setUserOne(String userOne) {
        this.userOne = userOne;
    }

    public String getUserTwo() {
        return userTwo;
    }

    public void setUserTwo(String userTwo) {
        this.userTwo = userTwo;
    }
}
