package com.team.house.houses.service;

import com.team.house.houses.entity.Street;

import java.util.List;


public interface StreetService {
    //通过区域编号查询街道
    public List<Street> getStreetByDid(Integer did);
}
