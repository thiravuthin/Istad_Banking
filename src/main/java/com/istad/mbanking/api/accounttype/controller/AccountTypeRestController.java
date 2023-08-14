package com.istad.mbanking.api.accounttype.controller;

import com.istad.mbanking.api.accounttype.service.AccountTypeService;
import com.istad.mbanking.best.BestRest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/v1/account-types")
@RequiredArgsConstructor
public class AccountTypeRestController {

    private final AccountTypeService accountTypeService;

    @GetMapping
    public BestRest<Object> findAll() {
        var accountTypeDtoList = accountTypeService.findAll();
        return BestRest.builder()
                        .status(true)
                        .code(HttpStatus.OK.value())
                        .message("Account type has been found")
                        .timeStamp(LocalDateTime.now())
                        .data(accountTypeDtoList)
                        .build();
    }

}
