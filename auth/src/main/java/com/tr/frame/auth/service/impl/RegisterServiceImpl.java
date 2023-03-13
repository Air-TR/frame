package com.tr.frame.auth.service.impl;

import com.tr.frame.auth.entity.User;
import com.tr.frame.auth.repository.UserRepository;
import com.tr.frame.auth.service.RegisterService;
import com.tr.frame.auth.util.PasswordEncoderUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: TR
 * @Date: 2023/3/10
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User register(User user) {
        user.setPassword(PasswordEncoderUtil.encode(user.getPassword()));
        return userRepository.save(user);
    }

}
