package com.tr.frame.auth.service;


import com.tr.frame.auth.controller.dto.UserUpdateDto;
import com.tr.frame.auth.entity.User;

public interface UserService {

    User findByUsername(String username);

    User findById(Integer id);

    void deleteById(Integer id);

    User update(UserUpdateDto updateDto);


}
