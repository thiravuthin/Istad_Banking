package com.istad.mbanking.api.auth.service;

import com.istad.mbanking.api.auth.model.RegisterDto;
import com.istad.mbanking.api.auth.repository.AuthMapper;
import com.istad.mbanking.api.user.model.User;
import com.istad.mbanking.api.user.repository.UserMapStruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService{

    private final AuthMapper authMapper;
    private final UserMapStruct userMapStruct;
//    private final PasswordEncoder passwordEncoder;
    @Override
    public void register(RegisterDto registerDto) {
        User user = userMapStruct.registerDtoToUser(registerDto);
        user.setIsVerified(false);
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
        log.info("User",user.getEmail());
        authMapper.register(user);
    }

    @Override
    public void verify(String email) {


    }
}
