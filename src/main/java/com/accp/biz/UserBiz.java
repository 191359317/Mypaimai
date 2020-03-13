package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.userMapper;
import com.accp.pojo.user;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class UserBiz {
	
	@Autowired
	private userMapper dao;
	
	
	//根据手机号（登陆账号）和密码查询 返回user对象 用于登陆储存会话
	public user queryByUphoneAndUpwd(String uphone,String upwd) {
		QueryWrapper<user> qw =Wrappers.query();
		qw.eq("uphone", uphone).eq("upwd", upwd);
		return dao.selectOne(qw);
	}
	
	//根据uid查询 返回user对象 用于查看账号信息
	public user queryByid(Integer uid) {
		QueryWrapper<user> qw =Wrappers.query();
		qw.eq("uid", uid);
		return dao.selectOne(qw);
	}
	
	//根据手机号（登陆账号）查询    返回count 用于判断数据库是否存在账号
	public Integer queryByUphoneCount(String uphone) {
		QueryWrapper<user> qw =Wrappers.query();
		qw.eq("uphone", uphone);
		return dao.selectCount(qw);
	}
	
	
	
	
	
	
	
}
