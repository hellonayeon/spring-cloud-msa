package me.hellonayeon.userservice.service;

import me.hellonayeon.userservice.dto.UserDto;
import me.hellonayeon.userservice.jpa.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();

}
