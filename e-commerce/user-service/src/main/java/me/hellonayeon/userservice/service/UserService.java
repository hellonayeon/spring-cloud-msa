package me.hellonayeon.userservice.service;

import me.hellonayeon.userservice.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
}
