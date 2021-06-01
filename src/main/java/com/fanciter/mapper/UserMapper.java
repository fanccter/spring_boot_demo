package com.fanciter.mapper;


import org.apache.ibatis.annotations.Param;
import com.fanciter.bean.UserBean;

public interface UserMapper {

    UserBean getInfo(@Param("name")String name, @Param("password")String password);

}
