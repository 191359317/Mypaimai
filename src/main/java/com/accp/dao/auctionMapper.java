package com.accp.dao;

import com.accp.pojo.auction;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface auctionMapper extends BaseMapper<auction>{
    int deleteByPrimaryKey(Integer aid);

    int insert(auction record);

    int insertSelective(auction record);

    auction selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(auction record);

    int updateByPrimaryKey(auction record);
}