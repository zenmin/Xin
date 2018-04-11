package com.xin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xin.dao.CategoryMapper;
import com.xin.pojo.Category;
import com.xin.pojo.CategoryExample;
import com.xin.pojo.CategoryExample.Criteria;

@Service
public class CategoryService {

	@Autowired 
	private CategoryMapper mapper;
	
	public List<Category> getCateParent() {
		CategoryExample example = new CategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentidEqualTo(-1);
		List<Category> list = mapper.selectByExample(example);
		return list;
	}
	
	public List<Category> getChilds() {
		CategoryExample example = new CategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentidNotEqualTo(-1);
		List<Category> list = mapper.selectByExample(example);
		return list;
	}

	public void saveCate(Category category) {
		mapper.updateByPrimaryKeySelective(category);
	}

	public Category findChildsById(String id) {
		return mapper.selectByPrimaryKey(Integer.parseInt(id));
	}

	public void delChildsById(String id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(Integer.parseInt(id));
	}
	public void delParentById(String id) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(Integer.parseInt(id));
		CategoryExample example = new CategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentidEqualTo(Integer.parseInt(id));
		mapper.deleteByExample(example);
	}

	public int insertCate(Category category) {
		System.out.println(category);
		int i = mapper.insertSelective(category);
		return i;
	}

	public int addCate(Category category) {
		return mapper.insertSelective(category);
	}
}








