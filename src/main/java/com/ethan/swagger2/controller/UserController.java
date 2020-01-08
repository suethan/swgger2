package com.ethan.swagger2.controller;

import com.ethan.swagger2.controller.dto.UserReq;
import com.ethan.swagger2.controller.dto.UserRes;
import io.swagger.annotations.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Author: ethan.liu
 * @Date: 2020/1/8 15:08
 */

@RestController
@RequestMapping("user")
@Api(tags = "用户模块")
public class UserController {

    @ApiOperation(value = "登录")
    @PostMapping("login")
    public UserRes login(@RequestBody UserReq userReq){
        System.out.println(userReq);
        UserRes userRes = new UserRes();
        userRes.setId("1");
        userRes.setName("test");
        userRes.setNickName("nickname");
        return userRes;
    }
    @GetMapping("test")
    public String login(){
        return "test";
    }

    //ApiParam的使用name参数名称，value参数说明
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求成功"),
            @ApiResponse(code = 400, message = "请求参数没填好"),
            @ApiResponse(code = 404, message = "请求路径没有或页面跳转路径不对")
    })
    @GetMapping("get_info")
    @ApiOperation("获取明细")
    public String getInfo(@ApiParam(name = "is",value = "id",required = true)String id){
        return "test";
    }
}
