package com.istad.mbanking.api.accounttype.repository;

import com.istad.mbanking.api.accounttype.AccountType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountTypeMapper {
    /* inline sql*/
    //@Select("select * from account_types")

    @SelectProvider(type = AccountTypeProvider.class, method = "buildSelectSQL")
    List<AccountType> select();
}
