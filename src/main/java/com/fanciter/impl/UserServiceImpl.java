package com.fanciter.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fanciter.bean.User;
import com.fanciter.bean.UserExample;
import com.fanciter.mapper.UserMapper;
import com.fanciter.service.UserService;
import com.fanciter.util.PwdMd5Util;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User>  loginIn(String name, String password) {
        UserExample example = new UserExample();
        example.createCriteria().andNameEqualTo(name).andPasswordEqualTo(PwdMd5Util.md5Password(password));
        return userMapper.selectByExample(example);
    }
}
