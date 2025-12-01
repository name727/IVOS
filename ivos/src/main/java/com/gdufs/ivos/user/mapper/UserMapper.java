package com.gdufs.ivos.user.mapper;

import com.gdufs.ivos.user.pojo.vo.UserVO;
import org.springframework.stereotype.Repository;

/*  @Repository注解表示当前是持久层的一部分，主要职责是进行数据库操作*/
@Repository
public interface UserMapper {
    UserVO selectByUsername(String name);
}
