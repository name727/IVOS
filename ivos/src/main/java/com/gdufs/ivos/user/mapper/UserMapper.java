package com.gdufs.ivos.user.mapper;

import com.gdufs.ivos.user.pojo.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    @Select("select * from user where username=#{userName}")
User seletctByUserName(String userName);
}
