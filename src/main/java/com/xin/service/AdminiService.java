package com.xin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xin.dao.AdminUserMapper;
import com.xin.pojo.AdminUser;
import com.xin.pojo.AdminUserExample;
import com.xin.pojo.AdminUserExample.Criteria;

@Service
public class AdminiService {

	@Autowired
	private AdminUserMapper mapper;
	
	public boolean checkUser(String username,String password) {
		AdminUserExample example = new AdminUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUnameEqualTo(username);
		criteria.andPasswdEqualTo(password);
		List<AdminUser> list = mapper.selectByExample(example);
		if(list.size()>0) {
			return true;
		}
		return false;
	}
}
