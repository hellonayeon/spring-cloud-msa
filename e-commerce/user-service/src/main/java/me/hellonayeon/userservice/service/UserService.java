package me.hellonayeon.userservice.service;

import me.hellonayeon.userservice.dto.UserDto;
import me.hellonayeon.userservice.jpa.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();

}
