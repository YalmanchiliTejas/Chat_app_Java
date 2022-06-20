package com.example.demo;



public class ChatRoomInitialisationDTO {

   private long userIdOne;
   private long userIdTwo;

    public ChatRoomInitialisationDTO() {
    }

    public ChatRoomInitialisationDTO(long userIdOne, long userIdTwo) {
        this.userIdOne = userIdOne;
        this.userIdTwo = userIdTwo;
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
