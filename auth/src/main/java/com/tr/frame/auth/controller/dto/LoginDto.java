package com.tr.frame.auth.controller.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Data
public class LoginDto {

    @NotBlank
    private String username;
    @NotBlank
    private String password;

}
