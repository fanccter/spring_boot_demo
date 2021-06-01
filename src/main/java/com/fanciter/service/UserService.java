package com.fanciter.service;

import java.util.List;
import com.fanciter.bean.User;

public interface UserService {

    List<User> loginIn(String name, String password);

}
