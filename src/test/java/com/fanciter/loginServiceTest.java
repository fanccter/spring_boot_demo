package com.fanciter;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.fanciter.bean.User;
import com.fanciter.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=com.fanciter.MainApplication.class)
public class loginServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void test() {
        List<User> users = userService.loginIn("test", "test");
        Assert.assertEquals(users.size(), 1);
    }

}
