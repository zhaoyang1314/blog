package com.lrm.service;

import com.lrm.po.User;

/**
 * Created by lm on 2020/10/15.
 */
public interface UserService {

    User checkUser(String username, String password);
}
