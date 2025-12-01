package com.gdufs.ivos.user.service.impl;

import com.gdufs.ivos.base.exception.ServiceException;
import com.gdufs.ivos.base.response.StatusCode;
import com.gdufs.ivos.user.mapper.UserMapper;
import com.gdufs.ivos.user.pojo.dto.UserLoginParam;
import com.gdufs.ivos.user.pojo.vo.UserVO;
import com.gdufs.ivos.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.rmi.ServerException;

/*  业务层实现类需要添加@Serveice注解，表示当前类为业务层实现类  */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserVO login(UserLoginParam userLoginParam) {
        log.debug("⽤⼾登录业务:userLoginParam={}",userLoginParam);
        UserVO userVO = userMapper.selectByUsername(userLoginParam.getUsername());
        if (userVO == null) {
            throw new ServiceException(StatusCode.USERNAME_ERROR);
        }
        if (!userLoginParam.getPassword().equals(userVO.getPassword())) {
            throw new ServiceException(StatusCode.PASSWORD_ERROR);
        }
        return userVO;
    }
}
