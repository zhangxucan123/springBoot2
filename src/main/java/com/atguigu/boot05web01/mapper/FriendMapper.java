package com.atguigu.boot05web01.mapper;

import com.atguigu.boot05web01.Bean.Friend;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FriendMapper {
    public Friend getFriendById(Integer id);
}
