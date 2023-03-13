package com.tr.frame.auth.controller;

import com.tr.frame.auth.controller.dto.UserUpdateDto;
import com.tr.frame.auth.entity.User;
import com.tr.frame.auth.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Api(tags = "User")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/user/{username}")
    public User findByUsername(@PathVariable String username) {
        return userService.findByUsername(username);
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable Integer id) {
        userService.deleteById(id);
    }

    @PutMapping("/user")
    public User update(@RequestBody @Valid UserUpdateDto updateDto) {
        return userService.update(updateDto);
    }

}
