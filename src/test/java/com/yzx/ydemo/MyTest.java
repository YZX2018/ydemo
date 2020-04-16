package com.yzx.ydemo;

import com.yzx.ydemo.bo.User;
import com.yzx.ydemo.dao.UserDAO;
import com.yzx.ydemo.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: yezhaoxin
 * @description: www.yezhaoxinjy.com
 * @since: 2020/4/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private TestService testService;
    @Test
    public void test(){
        User user = userDAO.selectAll();
        User user1 = userDAO.selectMap();
        System.out.println(user);
        System.out.println(user1);
    }

    @Test
    public void test1(){
        testService.test();
    }
}
