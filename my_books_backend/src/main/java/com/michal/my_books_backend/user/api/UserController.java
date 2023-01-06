package com.michal.my_books_backend.user.api;

import com.michal.my_books_backend.domain.User;
import com.michal.my_books_backend.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/users")
//@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    private final UserService userService;

    @PostMapping("/new")
    ResponseEntity<String> saveUser(@RequestBody User user){
        userService.saveUser(user);
        log.info("user is registrating...");
        return ResponseEntity.status(HttpStatus.CREATED).body("utworzono usera");
    }

    @GetMapping
    ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }
}
