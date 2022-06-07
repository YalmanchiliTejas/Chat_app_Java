package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

import java.util.List;
@Service
@Slf4j
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    /*
     * This function gets all the students in the repository
     */
     public List<User> getAll() {
        return userRepository.findAll();
     }


     /*
      * This function adds a new student to the database
      */
     public void addUser(User user){

       Optional<User> findByUsername = userRepository.findByEmail(user.getUsername());
       if (findByUsername.isPresent()) {

           throw new IllegalArgumentException("This username already exists\n");
       }
       userRepository.save(user);
     }

     /*
      * This function updates the student information
      */

    @Transactional
    public void updateUser(String username, String major, String name, String password) {

        Optional<User> findByUsername = userRepository.findByEmail(username);

        if (findByUsername.isEmpty()) {
            throw new IllegalArgumentException("This student doesn't exist\n");
        }

        User user = userRepository.findByEmail(username).orElseThrow();
        if (name != null && name.length() > 0 && major != null && major.length() > 0 && password != null &&
             password.length() > 0 ) {
            user.setMajor(major);
            user.setName(name);
            user.setPassword(password);
        }


    }

    /*
     * This function updates the online status of the User
     */
    public void updateStatus(String username) {

        Optional<User> findByUsername = userRepository.findByEmail(username);
        if(findByUsername.isEmpty()){
            throw new IllegalArgumentException("the mention student doesn't exist\n");
        }

        User user = userRepository.findByEmail(username).orElseThrow();
        if (user.isOnline()){
            user.setOnline(false);
        } else {
            user.setOnline(true);
        }


    }
    /*
     * This functions deletes the user with the given username
     * P.S I like writing comments ;)
     */
    public void deleteUser(String username){
        if (!userRepository.existsByUsername(username)){
            throw new IllegalArgumentException("The user with the given username doesn't exist\n");
        }
        User user = userRepository.findByEmail(username).orElseThrow();
        userRepository.delete(user);
    }

}

