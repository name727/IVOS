package com.gdufs.ivos.user.service;


import com.gdufs.ivos.user.pojo.dto.UserLoginParam;
import com.gdufs.ivos.user.pojo.vo.UserVO;

public interface UserService {
    UserVO login(UserLoginParam userLoginParam);
}
