package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, String> {

    List<ChatRoom> findExistingChannel( long id_one, long id_two);


    String getChatRoomId( long id_one , long id_two);

    ChatRoom getChatRoomById( String uuid);
}
