package com.atguigu.boot05web01;

import com.atguigu.boot05web01.Bean.User;
import com.atguigu.boot05web01.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
@Slf4j
@SpringBootTest
class Boot05Web01ApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from t_friend", Long.class);
        log.info("记录总数：{}",aLong);
    }
    @Test
    void testUser(){
        User user = userMapper.selectById(1L);
        log.info("用户信息:{}",user);
    }
}
