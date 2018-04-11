package com.xin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xin.pojo.Category;
import com.xin.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	@RequestMapping("/category")
	public String getCotegory(Model model) {
		List<Category> list = service.getCateParent();
		model.addAttribute("list",list);
		return "category";
	}
	@RequestMapping("/savecate")
	public String saveCate(Category category) {
		service.saveCate(category);
		return "redirect:category";
	}
	
	@RequestMapping("/insertparent")
	public String insertcate(Category category) {
		category.setParentid(-1);
		service.insertCate(category);
		return "redirect:category";
	}
	
	@RequestMapping("/addSp")
	public String addSp(Category category) {
		service.addCate(category);
		return "redirect:sp";
	}
	
	@RequestMapping("/addSpage")
	public String addSpage(Model model) {
		List<Category> list = service.getCateParent();
		model.addAttribute("parent",list);
		return "addsp";
	}
	
	@RequestMapping("/saveSp")
	public String saveSp(Category category) {
		service.saveCate(category);
		return "redirect:sp";
	}
	
	
	@RequestMapping("/sp")
	public String getSp(Model model) {
		List<Category> list = service.getChilds();
		model.addAttribute("list",list);
		return "sp";
	}
	@RequestMapping("/xgsp/{id}")
	public String xgSp(@PathVariable String id,Model model) {
		Category category = service.findChildsById(id);
		List<Category> list = service.getCateParent();
		model.addAttribute("parent",list);
		model.addAttribute("msg",category);
		return "xgsp";
	}

	@RequestMapping("/delsp")
	public String delcate(String id) {
		service.delChildsById(id);
		return "redirect:sp";
	}
	
	@RequestMapping("/delparent")
	public String delparent(String id) {
		service.delParentById(id);
		return "redirect:category";
	}
}
