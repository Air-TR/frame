package com.tr.frame.auth.entity;

import com.tr.frame.auth.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Data
@Entity
public class Role extends BaseEntity implements Serializable {

    @Column(length = 32, nullable = false, unique = true)
    private String rolename;
    @Column(length = 32, nullable = false)
    private String description;

}
