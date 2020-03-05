package com.team.house.houses.controller;

import com.team.house.houses.entity.District;
import com.team.house.houses.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 王建兵
 * @Classname DistrictController
 * @Description TODO
 * @Date 2020/2/25 16:40
 * @Created by Administrator
 */
@RestController   //全返回数据
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    @RequestMapping("/getAllDistrict")
    @CrossOrigin(value = "*",allowCredentials ="true" )
    public List<District> getAllDistrict(){
       return districtService.getAllDistrict();
    }
}
