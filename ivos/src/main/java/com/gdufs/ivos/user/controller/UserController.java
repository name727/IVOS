package com.gdufs.ivos.user.controller;

import com.gdufs.ivos.base.response.JsonResult;
import com.gdufs.ivos.user.pojo.dto.UserLoginParam;
import com.gdufs.ivos.user.pojo.vo.UserVO;
import com.gdufs.ivos.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public JsonResult login(@RequestBody UserLoginParam userLoginParam){
        log.debug("⽤⼾登录:userLoginParam={}",userLoginParam);
        //ctrl接口，ctrl+alt实现类
        UserVO userVO = userService.login(userLoginParam);
        return JsonResult.ok(userVO);
    }
}
