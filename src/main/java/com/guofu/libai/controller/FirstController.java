package com.guofu.libai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.guofu.libai.entity.User;
import com.guofu.libai.service.UserService;

@Controller
@RequestMapping("/spring")
public class FirstController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user" , method = RequestMethod.GET)
	public String getAlluser(@RequestParam("id")String id,Model model){
		User user = userService.getUserById(id);
		model.addAttribute("user", user);
		return "user/userInfo";
	}
	
}
