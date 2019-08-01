package com.service;

import com.model.UserInfo;

import java.io.Serializable;

public interface IUserService {
    /**
     * 测试方法
     */
    void test();

    /**
     * 保存用户
     * @param model 用户对象
     * @return
     */
    Serializable save(UserInfo model);
}
