package com.team.house.houses;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.team.house.houses.mapper")
public class HousesApplication {

    public static void main(String[] args) {
        SpringApplication.run(HousesApplication.class, args);
    }

}
