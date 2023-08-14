package com.istad.mbanking.api.user.service;

import com.istad.mbanking.api.user.model.CreateUserDto;
import com.istad.mbanking.api.user.model.UserDto;

public interface UserService {
    UserDto createNewUser( CreateUserDto createUserDto);

}
