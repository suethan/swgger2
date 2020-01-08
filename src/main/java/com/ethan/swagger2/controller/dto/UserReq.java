package com.ethan.swagger2.controller.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

/**
 * @Author: ethan.liu
 * @Date: 2020/1/8 15:14
 */
@Data
@ApiModel(value = "用户登录")
public class UserReq {
    @ApiModelProperty(value = "电话号码")
    private String tel;
    @ApiModelProperty(value = "密码")
    private String pwd;
}
