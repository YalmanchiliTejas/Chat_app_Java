package com.example.demo.FreeMessage;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository  extends JpaRepository<ChatMessage, Long> {
}
