package com.snow.oauserconsume.rest;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.snow.oauserconsume.entity.User;
import com.snow.oauserconsume.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user_consume")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserMapper userMapper;


    @RequestMapping(value = "/get/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "赵");
        List<User> users = userMapper.selectList(queryWrapper);

//        Map<String, Object> map = new HashMap<>();
//        map.put("name", "admin");
//        List<User> users = userMapper.selectByMap(map);
        return users;
    }


    /**
     * 根据用户ID获取用户信息
     * @param id 用户ID
     * @return User
     */
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") int id) {
        String name = restTemplate.getForObject("http://oa-user-center/config/getConfig", String.class);
        return name;
    }

    /**
     * 测试
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String get() {
        return "hello world";
    }
}
