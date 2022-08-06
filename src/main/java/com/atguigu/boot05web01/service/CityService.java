package com.atguigu.boot05web01.service;

import com.atguigu.boot05web01.Bean.City;
import com.atguigu.boot05web01.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    CityMapper cityMapper;

    public City getById(Long id ){
       return cityMapper.getById(id);
    }
}
