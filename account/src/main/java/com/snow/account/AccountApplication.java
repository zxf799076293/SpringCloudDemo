package com.snow.account;

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
//@EnableScheduling//启动时定时任务自动启动
public class AccountApplication {
    @LoadBalanced  //开启负载均衡
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        args = Arrays.copyOf(args, args.length + 1);
        args[args.length - 1] = "--spring.cloud.bootstrap.enabled=true";
        SpringApplication.run(AccountApplication.class, args);
    }

    @RestController
    public class TestController {

        RestTemplate restTemplate;

        @Autowired
        public TestController(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

        @GetMapping("/config")
        public String consumer() {
            return restTemplate.getForObject("http://oa-user-consume" + "/user_consume/get/users",String.class);
        }
    }
}
