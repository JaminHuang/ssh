package com.action;

import com.model.BookInfo;
import com.model.UserInfo;
import com.service.IBookService;
import com.service.IUserService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Date;

@ParentPackage("basePackage")
@Action(value = "strust2Test")
@Namespace("/")
public class TestAction {

    /**
     * 注入userService
     */
    @Autowired
    private IUserService userService;

    @Autowired
    private IBookService bookService;

    /**
     * 测试地址：http://localhost:8080/strust2Test!test.action
     */
    public void  test() {
        System.out.println("进入TestAction");
        userService.test();
    }

    /**
     * 测试地址：http://localhost:8080/strust2Test!saveUser.action
     */
    public void saveUser() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("abc");
        userInfo.setUserName("abc");
        userInfo.setAge(23);
        userInfo.setUpdateTime(new Date());
        userService.save(userInfo);
    }

    /**
     * 测试地址：http://localhost:8080/strust2Test!saveBook.action
     */
    public void saveBook() {
        BookInfo bookInfo = new BookInfo();
        bookInfo.setBookId("abc");
        bookInfo.setBookName("abc");
        bookInfo.setPrice(BigDecimal.valueOf(18.0));
        bookInfo.setUpdateTime(new Date());
        bookService.save(bookInfo);
    }

    /**
     * 测试地址：http://localhost:8080/strust2Test!insertBookList.action
     */
    public void insertBookList() {
        for (int i = 0; i < 10; i++) {
            BookInfo bookInfo = new BookInfo();
            bookInfo.setBookId("abc" + i);
            bookInfo.setBookName("abc" + i);
            bookInfo.setPrice(BigDecimal.valueOf(18.0 + i));
            bookInfo.setUpdateTime(new Date());
            bookService.save(bookInfo);
        }
    }
}
