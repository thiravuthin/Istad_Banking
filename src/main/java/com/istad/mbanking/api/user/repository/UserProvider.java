package com.istad.mbanking.api.user.repository;

import org.apache.ibatis.jdbc.SQL;

public class UserProvider {

    public String buildInsertSql(){
        return new SQL(){{{
            INSERT_INTO("users");
            VALUES("name", "#{u.name}");
            VALUES("gender", "#{u.gender}");
            VALUES("one_signal_id", "#{u.oneSignalId}");
            VALUES("student_card_id", "#{u.studentCardId}");
            VALUES("is_student", "#{u.isStudent}");
            VALUES("is_deleted", "#{u.FALSE}");
        }}}.toString();

    }

}
