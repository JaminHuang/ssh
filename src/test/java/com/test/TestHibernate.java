package com.test;

import com.model.UserInfo;
import com.service.IUserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestHibernate {

    private IUserService userService;

    /**
     * 在所有测试方法之前执行，且只执行一次
     */
    @Before
    public void before() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"spring.xml", "spring-hibernate.xml"});
        userService = (IUserService) applicationContext.getBean("userService");
    }

    @Test
    public void testSave() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("userId");
        userInfo.setUserName("小明");
        userInfo.setAge(25);
        userInfo.setUpdateTime(new Date());
        userService.save(userInfo);
    }
}
