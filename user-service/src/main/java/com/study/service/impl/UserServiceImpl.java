package com.study.service.impl;

import com.study.entity.User;
import com.study.mapper.UserMapper;
import com.study.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    public User getUserById(int uid){
        return userMapper.getUserById(uid);
    }

}
