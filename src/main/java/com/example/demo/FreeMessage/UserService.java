package com.example.demo.FreeMessage;

import java.util.List;
import java.util.Optional;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository rep ) {this.userRepository = rep;}

     public List<User> getUsers() {return userRepository.findAll();}

    public void AddNewStudent(User user) {

        Optional<User> findUsername =  userRepository.findByUsername(user.getUsername());

        if(findUsername.isPresent()){
            throw  new IllegalArgumentException("The Username already exists\n");
        }

        userRepository.save(user);
    }
    public List<User> getMajor(String major){
        return userRepository.findByMajor(major);
    }

    public void deleteStudent(long id){
        if(!userRepository.existsById(id )) {
            throw new IllegalArgumentException("There is no one with that particular Id\n");
        }
        userRepository.deleteById(id);
    }

    }
