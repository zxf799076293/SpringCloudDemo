package com.snow.oausercunter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.Arrays;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.snow.oausercunter.center.mapper")

public class OaUserCunterApplication {

    public static void main(String[] args) {
        SpringApplication.run(OaUserCunterApplication.class, args);
    }


}
