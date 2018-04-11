package com.xin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xin.dao.CategoryMapper;
import com.xin.pojo.Category;

@Service
public class ItemService {

	@Autowired 
	private CategoryMapper mapper;
	
	public Category getItem(String id) {

		Category category = mapper.selectByPrimaryKey(Integer.parseInt(id));
		
		return category;
	}
}
