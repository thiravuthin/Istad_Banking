package com.istad.mbanking.api.user.service;

import com.istad.mbanking.api.user.model.CreateUserDto;
import com.istad.mbanking.api.user.model.User;
import com.istad.mbanking.api.user.model.UserDto;
import com.istad.mbanking.api.user.repository.UserMapStruct;
import com.istad.mbanking.api.user.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserMapper userMapper;
    private final UserMapStruct userMapStruct;

    @Override
    public UserDto createNewUser(CreateUserDto createUserDto) {
        User  user = userMapStruct.createUserDtoToUser(createUserDto);
        userMapper.insert(user);
        return userMapStruct.userToUserDto(user);
    }
}
