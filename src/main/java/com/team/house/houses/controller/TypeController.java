package com.team.house.houses.controller;

import com.team.house.houses.entity.Type;
import com.team.house.houses.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //全返回数据
public class TypeController {
    @Autowired
    private TypeService typeService;
    //返回所有数据
    @CrossOrigin(value = "*",allowCredentials ="true" )  //解决跨域
    @RequestMapping("/getTypes")
    public List<Type> getTypes(){
      return  typeService.getAllType();
    }
}
