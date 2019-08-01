package com.dao.impl;

import com.dao.IBookInfoDao;
import com.model.BookInfo;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("bookInfoDao")
public class BookInfoDaoImpl implements IBookInfoDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<BookInfo> getlist() {

        Query query = sessionFactory.getCurrentSession().createQuery("from BookInfo");
        List<BookInfo> list = query.list();

        return list;
    }

    @Override
    public Serializable save(BookInfo model) {
        return sessionFactory.getCurrentSession().save(model);
    }
}
