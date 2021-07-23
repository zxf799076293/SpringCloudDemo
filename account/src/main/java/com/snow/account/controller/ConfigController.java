package com.snow.account.controller;

import com.snow.account.config.BusinessConfig;
import org.dromara.soul.client.springcloud.annotation.SoulSpringCloudClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/snowconfig")
@SoulSpringCloudClient(path = "/snowconfig")
public class ConfigController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private BusinessConfig businessConfig;

    @GetMapping("/users")
    @SoulSpringCloudClient(path = "/users")
    public String findById(@RequestParam("id") final String id) {
        String users = restTemplate.getForObject("http://oa-user-consume" + "/user_consume/get/users",String.class);

        return "::::::account" + id + "-custom:name=" + businessConfig.getName() + "--users:" + users;
    }
}
