package spring.intro.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.intro.model.UserModel;
import spring.intro.services.UserService;

import java.util.Optional;

@RestController
public class UserController {

    // dependency injection to avoid multiple instances of constructors
    private final UserService service;

    public UserController(UserService userServiceImpl) {
        this.service = userServiceImpl;
    }

    // difference between of and ofNullable?
    @GetMapping("/getUser/{userName}")
    public ResponseEntity<UserModel> getUser(@PathVariable String userName){
        return ResponseEntity.of(Optional.ofNullable(service.getUser(userName)));
    }

    @PostMapping("/addUser")
    public ResponseEntity<HttpStatus> createUser(@RequestBody UserModel user){
        service.addUser(user);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("/deleteUser/{userName}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userName){
        service.deleteUser(userName);
        return ResponseEntity.noContent().build();
    }
}
