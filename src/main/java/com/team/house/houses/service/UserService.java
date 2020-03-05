package com.team.house.houses.service;

import com.team.house.houses.entity.Users;

public interface UserService {
    //注册业务
     int regUser(Users users);
    //登入
     Users Login(String username, String password);
}
