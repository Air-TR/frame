package com.tr.frame.auth.controller.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Data
public class RegisterDto {

    @NotBlank
    private String username;
    @NotBlank
    private String password;

}
