package com.example.demo.Controllers;

import com.example.demo.Message;
import com.example.demo.MessageDTO;
import org.springframework.beans.BeansException;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface ChatRoomInterface {

 MessageDTO chatMessage(@DestinationVariable String channelId, MessageDTO message) throws BeansException;

}
