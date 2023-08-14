package com.istad.mbanking.api.user.controller;
import com.istad.mbanking.api.user.model.CreateUserDto;
import com.istad.mbanking.best.BestRest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@Slf4j
public class UserRestController {

    @PostMapping
    public BestRest<?> createNewUser(@RequestBody @Valid CreateUserDto  createUserDto){
        log.info("Dto = {}", createUserDto);
        return null;
    }
}
