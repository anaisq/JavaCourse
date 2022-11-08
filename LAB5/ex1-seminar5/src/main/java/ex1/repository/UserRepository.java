package ex1.repository;

import ex1.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public UserRepository(){
        initializeUsers();
    }

    private void initializeUsers(){
        users.add(User.builder().username("anamaria")
                .email("anamaria@test.ro")
                .information("Test info")
                .build());
        users.add(User.builder().username("cristina.popescu")
                .email("cristina.popescu@test.ro")
                .information("Test info")
                .build());
    }

    public void addUser(User user){
        users.add(user);
    }

    public void deleteUser(User user){
        users.remove(user);
    }

    public List<User> getUsers(){
        return users;
    }

}
