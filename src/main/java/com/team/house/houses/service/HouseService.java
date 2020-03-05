package com.team.house.houses.service;

import com.github.pagehelper.PageInfo;
import com.team.house.houses.entity.House;
import com.team.house.houses.util.HouseCondition;
import com.team.house.houses.util.PagePrameter;

public interface HouseService {

    public int addHouse(House house);


    public PageInfo<House> getHouseByUserId(Integer uid, PagePrameter pagePrameter);
    //public PageInfo<House> getHouseByUserId(Integer page, Integer pageSize, Integer uid);


    public int deleteHouse(String id);
    /**
     * 搜索浏览出租房
     * @param houseCondition  搜索条件
     * @return 返回搜索的出租房
     */
    public PageInfo<House>  getBroswerHouse(HouseCondition houseCondition);

}
