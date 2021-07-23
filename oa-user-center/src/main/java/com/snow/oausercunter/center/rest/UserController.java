package com.snow.oausercunter.center.rest;

import com.snow.oausercunter.center.entity.User;
import com.snow.oausercunter.center.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户ID获取用户信息
     * @param id 用户ID
     * @return User
     */
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") int id) {
        User user = userMapper.selectByPrimaryKey(id);
        user.setApikey(String.valueOf(id) + "-provider");
        return user;
    }

    /**
     * 测试
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String get() {
        return "hello world";
    }
}
