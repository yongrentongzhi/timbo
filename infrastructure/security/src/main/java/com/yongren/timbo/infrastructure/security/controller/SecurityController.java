package com.yongren.timbo.infrastructure.security.controller;

import com.yongren.timbo.infrastructure.security.vo.ResultVo;
import com.yongren.timbo.infrastructure.security.vo.request.FormRegisterRvo;
import com.yongren.timbo.infrastructure.security.vo.request.UsernameAndPasswordLoginRvo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/security")
public class SecurityController {


    /**
     * 用户名、密码登陆接口
     */
    @PostMapping(value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResultVo<String> login(@RequestBody UsernameAndPasswordLoginRvo requestVo) {
        return ResultVo.success("登陆请求被拦截");
    }

    /**
     * 用户名、密码注册接口
     */
    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResultVo<String> register(@RequestBody FormRegisterRvo requestVo) {
        return ResultVo.success("");
    }

}
