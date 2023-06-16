package com.tr.frame.auth.service.impl;

import com.tr.frame.auth.entity.User;
import com.tr.frame.auth.repository.UserRepository;
import com.tr.frame.auth.service.RegisterService;
import com.tr.frame.auth.util.PasswordEncoderUtil;
import com.tr.frame.common.exception.BusinessException;
import com.tr.frame.common.kit.Base64Kit;
import com.tr.frame.common.result.ResultEnum;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

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
        if (Objects.nonNull(userRepository.findByUsername(user.getUsername()).orElse(null))) {
            throw new BusinessException(ResultEnum.USERNAME_EXIST);
        }
        user.setPassword(PasswordEncoderUtil.encode(Base64Kit.decode(user.getPassword())));
        return userRepository.save(user);
    }

}
