package com.tr.frame.auth.service;

import com.tr.frame.auth.controller.dto.UserRoleAddDto;
import com.tr.frame.auth.entity.UserRole;

import java.util.List;

public interface UserRoleService {

    List<UserRole> save(UserRoleAddDto addDto);

}
