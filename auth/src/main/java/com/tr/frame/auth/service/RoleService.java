package com.tr.frame.auth.service;

import com.tr.frame.auth.controller.dto.RoleUpdateDto;
import com.tr.frame.auth.entity.Role;

public interface RoleService {

    Role save(Role role);

    Role findById(Integer id);

    void deleteById(Integer id);

    Role update(RoleUpdateDto updateDto);

}
