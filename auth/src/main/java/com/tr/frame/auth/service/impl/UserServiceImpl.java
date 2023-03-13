package com.tr.frame.auth.service.impl;

import com.tr.frame.auth.controller.dto.UserUpdateDto;
import com.tr.frame.auth.entity.User;
import com.tr.frame.auth.repository.UserRepository;
import com.tr.frame.auth.service.UserService;
import com.tr.frame.common.exception.BusinessException;
import com.tr.frame.common.kit.BeanKit;
import com.tr.frame.common.result.ResultEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author taorun
 * @date 2023/1/30 9:27
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(() -> new BusinessException(ResultEnum.USER_NOT_EXIST));
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new BusinessException(ResultEnum.USER_NOT_EXIST));
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }


    @Override
    public User update(UserUpdateDto updateDto) {
        User user = findById(updateDto.getId());
        BeanKit.copyPropertiesIgnoreNull(updateDto, user);
        return userRepository.save(user);
    }

}
