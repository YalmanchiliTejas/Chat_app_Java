package com.example.demo.FreeMessage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class UserController {

    private final UserRepository userRepository ;

    public UserController(UserRepository rep ) {
        this.userRepository = rep;
    }

}
