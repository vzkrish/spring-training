package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	UserRepo repo;

	@RequestMapping(path = "/login.do", method = RequestMethod.GET)
	public String getPage() {
		return "login";
	}

	@RequestMapping(path = "/login.do", method = RequestMethod.POST)
	public ModelAndView doLogin(@RequestParam("username") String user, @RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView();
		User userObj = repo.findOne(user);
		if (userObj != null) {
			if (userObj.getPassword().equals(password)) {
				mv.setViewName("success");
				mv.addObject("userName", user);
				return mv;
			} else {
				mv.setViewName("failure");
				return mv;
			}
		} else {
			mv.setViewName("failure");
			return mv;
		}
	}
}
