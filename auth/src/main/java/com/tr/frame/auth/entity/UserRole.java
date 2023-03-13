package com.tr.frame.auth.entity;

import com.tr.frame.auth.entity.pk.UserRolePK;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Data
@Entity
@IdClass(UserRolePK.class)
public class UserRole implements Serializable {

    @Id
    private Integer userId;
    @Id
    private Integer roleId;

}
