package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	UserValidationService userValidationService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String handleLoginRequest(
			@RequestParam String name, 
			@RequestParam String password,
			ModelMap modelMap) {
		
		if (!userValidationService.isUserValid(name, password)) {
			modelMap.addAttribute("errorMessage","The user or password are invalid");
			return "login";
		}

		modelMap.addAttribute("name",name);
		return "welcome";
	}
}
