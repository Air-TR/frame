package com.tr.frame.auth.service;

import com.tr.frame.auth.entity.User;

public interface LoginAndOutService {

    String login(User user);

    Boolean logout(String token);

}
