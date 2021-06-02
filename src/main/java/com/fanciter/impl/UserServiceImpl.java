package com.fanciter.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fanciter.bean.User;
import com.fanciter.bean.UserExample;
import com.fanciter.mapper.UserMapper;
import com.fanciter.service.UserService;
import com.fanciter.util.PwdMd5Util;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> loginIn(String name, String password) {
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(PwdMd5Util.md5Password(password));

        log.info("info 登录");
        log.warn("warn 登录");
        log.error("error 登录");
        log.debug("debug 登录");
        return userMapper.selectByExample(example);
    }
}
