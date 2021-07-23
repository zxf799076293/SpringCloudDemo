package com.snow.oauserconsume.rest;

import org.dromara.soul.client.springcloud.annotation.SoulSpringCloudClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/config")
@RefreshScope
//@SoulSpringCloudClient(path = "/config")

public class ConfigController {

    @Value("${config.name}")
    private String name;

    @RequestMapping("/config/getConfig")
//    @SoulSpringCloudClient(path = "/getConfig")
    public String getConfig() {
        return this.name;
    }
}
