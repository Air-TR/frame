package com.tr.frame.auth.entity.pk;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Data
public class UserRolePK implements Serializable {

    private Integer userId;
    private Integer roleId;

}
