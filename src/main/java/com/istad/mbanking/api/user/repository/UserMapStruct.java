package com.istad.mbanking.api.user.repository;

import com.istad.mbanking.api.auth.model.RegisterDto;
import com.istad.mbanking.api.user.model.CreateUserDto;
import com.istad.mbanking.api.user.model.User;
import com.istad.mbanking.api.user.model.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapStruct {
        User createUserDtoToUser (CreateUserDto createUserDto);
        UserDto userToUserDto (User user);
        User userDtoToUser (UserDto userDto);
        User registerDtoToUser(RegisterDto registerDto);

}
