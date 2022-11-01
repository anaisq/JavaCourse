package main.controller;

import main.model.User;
import main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserInterfaceController {

    private final UserService userService;

    @Autowired
    public UserInterfaceController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/view-create")
    public String viewCreate(User user){
        return "createuser";
    }

    @PostMapping("/create")
    public String createUser(User user, Model model){
        userService.addUser(user);
        model.addAttribute("users", userService.getUserList());
        return "viewusers";
    }
}
