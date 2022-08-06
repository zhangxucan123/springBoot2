package com.atguigu.boot05web01.service;

import com.atguigu.boot05web01.Bean.Friend;
import com.atguigu.boot05web01.mapper.FriendMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendService {

    @Autowired
    FriendMapper friendMapper;

    public Friend getFriendById(Integer id){
        return friendMapper.getFriendById(id);
    }
}
