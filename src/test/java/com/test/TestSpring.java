package com.test;

import com.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestSpring {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] {"spring.xml", "spring-hibernate.xml"});
        IUserService userService = (IUserService) applicationContext.getBean("userService");
        userService.test();
    }
}
