package main.controller;

import main.model.User;
import main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
        userService.addUser(User.builder().username("Ana").email("ana@test.ro").build());
    }

    @GetMapping("/getUsers")
    public String getAllUsers(){
        return userService.toString();
    }

    @GetMapping("/getUserByUsername/{name}")
    public String getUserByName(@PathVariable String name){
        return userService.getUserByUserName(name).toString();
    }

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @DeleteMapping("/deleteUser")
    public void deleteUser(@RequestBody String username){
        userService.deleteUser(username);
    }
}
