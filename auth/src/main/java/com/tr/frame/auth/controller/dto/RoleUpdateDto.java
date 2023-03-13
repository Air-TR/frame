package com.tr.frame.auth.controller.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Data
public class RoleUpdateDto {

    @NotNull
    private Integer id;
    private String rolename;
    private String description;

}
