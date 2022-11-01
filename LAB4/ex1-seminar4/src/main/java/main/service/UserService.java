package main.service;

import main.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    public List<User> getUserList(){
        return userList;
    }

    public void addUser(User user){
        Optional<User> userFound = userList.stream().filter(u -> u.getUsername().equals(user.getUsername())).findFirst();
        if(!userFound.isPresent()){
            userList.add(user);
        }
    }

    private Optional<User> findUserByUserName(String username){
        return userList.stream().filter(u -> u.getUsername().equals(username)).findFirst();
    }

    public void deleteUser(String username){
        Optional<User> userFound = findUserByUserName(username);
        if(userFound.isPresent())
            userList.remove(userFound.get());
    }

    public User getUserByUserName(String username){
        return findUserByUserName(username).get();
    }

    @Override
    public String toString() {
        String users = "";
        for (User user : userList) {
            users += user.toString() + "\n";
        }
        return users;
    }
}
