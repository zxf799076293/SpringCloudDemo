package com.snow.oauserconsume;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.snow.oauserconsume.mapper")
public class OaUserConsumeApplication {

    @LoadBalanced  //开启负载均衡
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(OaUserConsumeApplication.class, args);
    }

    @RestController
    public class TestController {

        RestTemplate restTemplate;

        @Autowired
        public TestController(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

        @GetMapping("/consumer")
        public String consumer() {
            return restTemplate.getForObject("http://oa-user-center" + "/user/get/1",String.class);
        }
    }


}
