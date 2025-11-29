package com.gdufs.ivos.user.pojo.dto;

import io.swagger.annotations.ApiModelProperty;import lombok.Data;
@Data
public class UserLoginParam {
    @ApiModelProperty(value="⽤⼾名")
    private String username;
    @ApiModelProperty(value="密码")
    private String password;
}
