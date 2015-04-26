package com.springapp.mvc.controller;

import com.springapp.foundation.database.UserDao;
import com.springapp.foundation.database.UserDaoImpl;
import com.springapp.foundation.database.UserMapperBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    private UserDao userService;
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
        UserMapperBean userMapperBean = new UserMapperBean();
        userMapperBean.setId(1);
        userMapperBean = userService.selectUserById(userMapperBean);
		model.addAttribute("message", "Hello world!");
        model.addAttribute("name", userMapperBean.getName());
		return "hello";
	}
}