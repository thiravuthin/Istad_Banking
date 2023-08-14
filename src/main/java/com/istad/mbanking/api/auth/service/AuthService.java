package com.istad.mbanking.api.auth.service;

import com.istad.mbanking.api.auth.model.RegisterDto;

public interface AuthService {
    void register(RegisterDto registerDto);
    void verify (String email);
}
