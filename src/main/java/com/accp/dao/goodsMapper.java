package com.accp.dao;

import com.accp.pojo.goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface goodsMapper extends BaseMapper<goods>{
    int deleteByPrimaryKey(Integer gid);

    int insert(goods record);

    int insertSelective(goods record);

    goods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(goods record);

    int updateByPrimaryKey(goods record);
}