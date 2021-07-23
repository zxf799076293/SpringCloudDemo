package com.snow.oausercunter.center.mapper;

import com.snow.oausercunter.center.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@org.apache.ibatis.annotations.Mapper
@Repository
public interface UserMapper extends Mapper<User> {
//    User selectByPrimaryKey(int id);

}