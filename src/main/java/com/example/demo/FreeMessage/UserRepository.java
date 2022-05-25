package com.example.demo.FreeMessage;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


  Optional<User> findByUsername(String  username);

   List<User>  findByMajor (String major);
}
