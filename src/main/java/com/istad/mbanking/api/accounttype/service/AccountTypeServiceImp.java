package com.istad.mbanking.api.accounttype.service;

import com.istad.mbanking.api.accounttype.*;
import com.istad.mbanking.api.accounttype.repository.AccountTypeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountTypeServiceImp implements AccountTypeService {

    private final AccountTypeMapper accountTypeMapper;
    private final AccountTypeMapStruct accountTypeMapStruct;
    @Override
    public List<AccountTypeDto> findAll() {
        List<AccountType> accountTypes = accountTypeMapper.select();
//        List<AccountTypeDto> accountTypeDtoList = accountTypes.stream()
//                .map(accountType -> new AccountTypeDto(accountType.getName()))
//                .toList();
        return accountTypeMapStruct.toDto(accountTypes);
    }

}
