package com.service.impl;

import com.dao.IBookInfoDao;
import com.model.BookInfo;
import com.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements IBookService {

    @Autowired
    private IBookInfoDao bookInfoDao;

    @Override
    public List<BookInfo> getlist() {
        List<BookInfo> list = bookInfoDao.getlist();

        return list;
    }

    @Override
    public Serializable save(BookInfo model) {
        return bookInfoDao.save(model);
    }
}
