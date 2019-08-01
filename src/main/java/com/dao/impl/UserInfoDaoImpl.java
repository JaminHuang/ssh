package com.dao.impl;

import com.dao.IUserInfoDao;
import com.model.UserInfo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("userInfoDao")
public class UserInfoDaoImpl implements IUserInfoDao {

    /**
     * 注入Session工厂
     */
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Serializable save(UserInfo model) {
        return sessionFactory.getCurrentSession().save(model);
    }
}
