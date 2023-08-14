package com.istad.mbanking.api.user.repository;

import com.istad.mbanking.api.user.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    @SelectProvider(type = UserProvider.class, method = "buildInsertSql")
    void insert(@Param("u") User user);
}
