package com.service.impl;

import com.dao.IUserInfoDao;
import com.model.UserInfo;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserInfoDao userInfoDao;

    @Override
    public void test() {
        System.out.println("Hello World");
    }

    @Override
    public Serializable save(UserInfo model) {
        return userInfoDao.save(model);
    }
}
