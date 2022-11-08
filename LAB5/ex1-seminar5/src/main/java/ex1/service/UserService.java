package ex1.service;

import ex1.dto.UserDTO;
import ex1.entity.User;
import ex1.mapper.UserMapper;
import ex1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public List<UserDTO> users(){
        return userRepository.getUsers().stream()
                .map(user -> userMapper.mapUserToDTO(user))
                .collect(Collectors.toList());
    }

    private Optional<User> findUserInUsersList(String username){
        return userRepository.getUsers().stream()
                .filter(u -> u.getUsername().equals(username))
                .findFirst();
    }

    public boolean addUser(UserDTO userDTO){
        if(findUserInUsersList(userDTO.getName()).isEmpty()){
            userRepository.addUser(userMapper.mapDTOToUser(userDTO));
            return true;
        }
        return false;
    }

    public boolean deleteUser(String username){
        if(!findUserInUsersList(username).isEmpty()){
            userRepository.deleteUser(findUserInUsersList(username).get());
            return true;
        }
        else return false;
    }
}
