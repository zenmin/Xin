package com.xin.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.xin.pojo.Category;
import com.xin.pojo.Msg;
import com.xin.pojo.Webmsg;
import com.xin.service.IndexService;
import com.xin.service.ItemService;

@Controller
public class IndexController {

	@Autowired 
	private IndexService service;
	@Autowired 
	private ItemService iservice;
	
	
	@RequestMapping("/to/{page}")
	public String topage(@PathVariable String page) {
		return page;
	}
	
	@RequestMapping("/rx")
	public String toAdmin() {
		return "admin";
	}
	
	@RequestMapping("/index")
	public String toPage(Model model) {
		Webmsg webMsg = service.getWebMsg();
		model.addAttribute("webmsg", webMsg);
		
		List<Category> list = service.getParentCate();
		model.addAttribute("cateparent",list);
		
		for (Category c : list) {
			List<Category> byParentId = service.getByParentId(c.getId());
			model.addAttribute("onelist", byParentId);
		}
		
		System.out.println(list);
		return "index";
	}
	
	@RequestMapping("/item/{id}")
	public String toItem(@PathVariable String id,Model model) {
		Category item = iservice.getItem(id);
		model.addAttribute("item",item);
		return "item";
	}
	
	@ResponseBody
	@RequestMapping("/getChilds")
	public Msg getByParentID(Integer id){
		List<Category> list = service.getByParentId(id);
		return Msg.success().add("list", list);
	}
}













