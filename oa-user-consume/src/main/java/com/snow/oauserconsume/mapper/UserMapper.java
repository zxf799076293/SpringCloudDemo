package com.snow.oauserconsume.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.snow.oauserconsume.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}