package com.xin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xin.pojo.Webmsg;
import com.xin.service.WebMsgService;

@Controller
public class WebMsgController {

	@Autowired
	private WebMsgService service;
	
	@RequestMapping("/webmsg")
	public String getMSg(Model model) {
		Webmsg msg = service.getMsg();
		model.addAttribute("msg",msg);
		return "webmsg";
	}
	
	@RequestMapping("/saveMsg")
	public String saveMSg(Webmsg webmsg) {
		service.saveMsg(webmsg);
		return "redirect:webmsg";
	}
}
