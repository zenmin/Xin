package com.xin.controller;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xin.service.AdminiService;


@Controller
public class AdminController {

	@Autowired
	private AdminiService service;
	
	@RequestMapping("/tologin")
	public String tologin() {
		return "log";
	}
	
	@RequestMapping("/login")
	public String login(String username,String password,HttpSession session) {
		boolean b = service.checkUser(username, password);
		if(b==true) {
			session.setAttribute("username", username);
			return "redirect:rx";
		}
		return "log";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		session.invalidate();
		return "log";
	}
}
