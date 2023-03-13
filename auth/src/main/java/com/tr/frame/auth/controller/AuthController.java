package com.tr.frame.auth.controller;

import com.tr.frame.auth.controller.dto.LoginDto;
import com.tr.frame.auth.controller.dto.RegisterDto;
import com.tr.frame.auth.entity.User;
import com.tr.frame.auth.service.RegisterService;
import com.tr.frame.auth.service.impl.LoginAndOutServiceImpl;
import com.tr.frame.common.kit.ConvertKit;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Api(tags = "Auth")
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Resource
    private RegisterService registerService;

    @Resource
    private LoginAndOutServiceImpl loginAndOutService;

    @PostMapping("/register")
    public User register(@RequestBody @Valid RegisterDto registerDto) {
        return registerService.register(ConvertKit.convert(registerDto, User.class));
    }

    /**
     * 登录成功返回 token
     */
    @PostMapping("/login")
    public String login(@RequestBody @Valid LoginDto loginDto) {
        return loginAndOutService.login(ConvertKit.convert(loginDto, User.class));
    }

}
