package com.service;

import com.model.BookInfo;

import java.io.Serializable;
import java.util.List;

public interface IBookService {

    List<BookInfo> getlist();

    Serializable save(BookInfo model);
}
