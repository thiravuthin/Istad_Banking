package com.istad.mbanking.api.auth.controller;

import com.istad.mbanking.api.auth.model.RegisterDto;
import com.istad.mbanking.api.auth.service.AuthService;
import com.istad.mbanking.best.BestRest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthRestController {

    private final AuthService authService;


    @PostMapping("/register")
    public BestRest<?> register(@RequestBody @Valid  RegisterDto registerDto){
        authService.register(registerDto);
        return BestRest.builder()
                .status(true)
                .code(HttpStatus.OK.value())
                .message("You has been register successfully")
                .timeStamp(LocalDateTime.now())
                .data(registerDto.email())
                .build();
    }

    @PostMapping("/verify")
    public BestRest<?> verify(@RequestParam String email){
        return BestRest.builder()
                .status(true)
                .code(HttpStatus.OK.value())
                .message("Please check email verify!")
                .timeStamp(LocalDateTime.now())
                .data(email)
                .build();
    }
}
