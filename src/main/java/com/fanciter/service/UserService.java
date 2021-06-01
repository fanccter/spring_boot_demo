package com.fanciter.service;

import com.fanciter.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name, String password);

}
