package com.snow.oausercunter.center.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("config")
@RefreshScope
public class ConfigController {

    @Value("${config_test.name}")
    private String name;

    @RequestMapping("/getConfig")
    public String getConfig() {
        return this.name;
    }
}
