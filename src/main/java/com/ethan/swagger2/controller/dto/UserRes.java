package com.ethan.swagger2.controller.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author: ethan.liu
 * @Date: 2020/1/8 15:16
 */
@Data
public class UserRes {
    @ApiModelProperty(value = "姓名")
    private String name;
    @ApiModelProperty(value = "用户id")
    private String id;
    @ApiModelProperty(value = "用户昵称")
    private String nickName;
}
