package com.accp.dao;

import com.accp.pojo.user;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface userMapper extends BaseMapper<user>{
    int deleteByPrimaryKey(Integer uid);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKey(user record);
}