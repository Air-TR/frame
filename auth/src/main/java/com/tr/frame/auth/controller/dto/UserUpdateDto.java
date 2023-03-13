package com.tr.frame.auth.controller.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Data
public class UserUpdateDto {

    @NotNull
    private Integer id;
    private String nickname;
    private String realname;
    private Integer age;
    private String email;
    private String address;
    private String idcard;

}
