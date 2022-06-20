package com.example.demo;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface MessageRepository extends JpaRepository<Message, UUID> {


    @Override
    Optional<Message> findById(UUID uuid);

   List<Message> getExistingMessages(long userOneId, long userTwoId);
}


