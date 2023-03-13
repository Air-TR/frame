package com.tr.frame.auth.service.impl;

import com.tr.frame.auth.controller.dto.UserRoleAddDto;
import com.tr.frame.auth.entity.UserRole;
import com.tr.frame.auth.repository.UserRoleRepository;
import com.tr.frame.auth.service.UserRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Resource
    private UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> save(UserRoleAddDto addDto) {
        List<UserRole> userRoleList = new ArrayList<>();
        addDto.getRoleIds().forEach(roleId -> {
            UserRole userRole = new UserRole();
            userRole.setUserId(addDto.getUserId());
            userRole.setRoleId(roleId);
            userRoleList.add(userRole);
        });
        return userRoleRepository.saveAll(userRoleList);
    }

}
