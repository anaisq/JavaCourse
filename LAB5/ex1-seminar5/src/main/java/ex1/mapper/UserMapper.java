package ex1.mapper;

import ex1.dto.UserDTO;
import ex1.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDTO mapUserToDTO(User user){
        return UserDTO.builder()
                .name(user.getUsername())
                .email(user.getEmail())
                .accountInformation(user.getInformation())
                .build();
    }

    public User mapDTOToUser(UserDTO userDTO){
        return User.builder()
                .username(userDTO.getName())
                .email(userDTO.getEmail())
                .information(userDTO.getAccountInformation())
                .build();
    }
}
