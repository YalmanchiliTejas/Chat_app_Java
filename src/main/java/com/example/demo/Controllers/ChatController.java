package com.example.demo.Controllers;

import com.example.demo.Message;
import com.example.demo.UserRepository;
import com.example.demo.WebSocketConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller

public class ChatController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;
    @Autowired
    private UserRepository userRepo;



    @MessageMapping("/chat/{to}")
    public void sendMessage(@DestinationVariable String to, Message message){
        if ((userRepo.existsByUsername(to))) {
            messagingTemplate.convertAndSend("/user/messages" + to, message );
        }
    }


}
