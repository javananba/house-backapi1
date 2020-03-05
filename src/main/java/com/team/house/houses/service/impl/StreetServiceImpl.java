package com.team.house.houses.service.impl;

import com.team.house.houses.entity.StreetExample;
import com.team.house.houses.mapper.StreetMapper;
import com.team.house.houses.service.StreetService;
import com.team.house.houses.entity.Street;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StreetServiceImpl implements StreetService {
    @Autowired(required = false)
    private StreetMapper streetMapper;
    @Override
    public List<Street> getStreetByDid(Integer did) {
        StreetExample streetExample=new StreetExample();
        StreetExample.Criteria criteria=streetExample.createCriteria();
        criteria.andDistrictIdEqualTo(did); //传条件
        return streetMapper.selectByExample(streetExample);
    }
}
