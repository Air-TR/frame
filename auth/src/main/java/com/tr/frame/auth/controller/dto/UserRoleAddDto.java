package com.tr.frame.auth.controller.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Data
public class UserRoleAddDto {

    @NotNull
    private Integer userId;

    @NotEmpty
    private List<Integer> roleIds;

}
