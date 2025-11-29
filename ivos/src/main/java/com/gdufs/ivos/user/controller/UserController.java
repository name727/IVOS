package com.gdufs.ivos.user.controller;

import com.gdufs.ivos.base.response.JsonResult;
import com.gdufs.ivos.user.mapper.UserMapper;
import com.gdufs.ivos.user.pojo.dto.UserLoginParam;
import com.gdufs.ivos.user.pojo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @PostMapping("login")
    public JsonResult login(@RequestBody UserLoginParam userLoginParam){
        log.debug("⽤⼾登录:userLoginParam={}",userLoginParam);
        String username = userLoginParam.getUsername();
        User user =userMapper.seletctByUserName(username);
        log.debug("数据库User 对象{}",user);
        return JsonResult.ok();
    }
}
