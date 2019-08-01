package com.dao;

import com.model.UserInfo;

import java.io.Serializable;

public interface IUserInfoDao {

    /**
     * 保存用户
     * @param model 用户对象
     * @return
     */
    Serializable save(UserInfo model);
}
