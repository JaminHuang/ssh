package com.dao;

import com.model.BookInfo;

import java.io.Serializable;
import java.util.List;

public interface IBookInfoDao {

    /**
     * 获取书籍列表
     * @return
     */
    public List<BookInfo> getlist();

    /**
     * 保存书籍
     * @param model
     * @return
     */
    Serializable save(BookInfo model);
}
