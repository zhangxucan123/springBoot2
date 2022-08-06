package com.atguigu.boot05web01.service.impl;

import com.atguigu.boot05web01.Bean.User;
import com.atguigu.boot05web01.mapper.UserMapper;
import com.atguigu.boot05web01.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
