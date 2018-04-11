package com.xin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xin.dao.CategoryMapper;
import com.xin.dao.WebmsgMapper;
import com.xin.pojo.Category;
import com.xin.pojo.CategoryExample;
import com.xin.pojo.CategoryExample.Criteria;
import com.xin.pojo.Webmsg;
import com.xin.pojo.WebmsgExample;

@Service 
public class IndexService {

	@Autowired
	private WebmsgMapper wmapper;
	@Autowired
	private CategoryMapper cmapper;
	public Webmsg getWebMsg() {
		List<Webmsg> selectByExample = wmapper.selectByExample(null);
		Webmsg webmsg = selectByExample.get(0);
		return webmsg;
	}
	
	public List<Category> getParentCate() {
		CategoryExample example = new CategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentidEqualTo(-1);
		List<Category> selectByExample = cmapper.selectByExample(example);
		return selectByExample;
	}
	
	public List<Category> getByParentId(Integer parentid) {
		CategoryExample example = new CategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentidEqualTo(parentid);
		List<Category> selectByExample = cmapper.selectByExample(example);
		return selectByExample;
	}
	
	
	
}

















