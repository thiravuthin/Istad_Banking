package com.istad.mbanking.api.accounttype.repository;

import org.apache.ibatis.jdbc.SQL;

/* AccountTypeProvider is the that for provide mapper class for my batis implement*/
public class AccountTypeProvider {
    /* Dynamic SQL Mybatis*/
    public String buildSelectSQL(){
        return new SQL(){{
            SELECT("*");
            FROM("account_types");
        }}.toString();

    }
}
