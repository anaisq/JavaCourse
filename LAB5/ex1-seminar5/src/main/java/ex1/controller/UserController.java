package ex1.controller;

import ex1.dto.UserDTO;
import ex1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDTO> getUsers(){
        return userService.users();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody(required = true) UserDTO userDTO, HttpServletResponse response) {
        if (userService.addUser(userDTO)) {
            response.setStatus(HttpServletResponse.SC_CREATED);
            return String.format("User %s added", userDTO.getName());
        }
        else {
            response.setStatus(HttpServletResponse.SC_FOUND);
            return String.format("User %s already present.", userDTO.getName());
        }
    }


    @PostMapping("/addUser/{username}")
    public String add(@PathVariable(value = "username", required = true) String username,
                      @RequestParam(value = "email", required= false, defaultValue = "anonimus@test.ro") String email,
                      @RequestParam(value = "info", required = false, defaultValue = "no info") String info,
                        HttpServletResponse response){
        UserDTO userDTO = UserDTO.builder()
                .name(username)
                .email(email)
                .accountInformation(info)
                .build();
        if(userService.addUser(userDTO)){
            response.setStatus(HttpServletResponse.SC_CREATED);
            return String.format("User %s added", userDTO.getName());
        }
        else{
            response.setStatus(HttpServletResponse.SC_FOUND);
            return String.format("User %s already present.", userDTO.getName());
        }
    }

    @DeleteMapping("/deleteUser/{username}")
    public String deleteUser(@PathVariable String username, HttpServletResponse response) {
        if (userService.deleteUser(username)) {
            response.setStatus(HttpServletResponse.SC_OK);
            return String.format("User %s was deleted.", username);
        } else {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return String.format("User %s not found.", username);
        }
    }
}
