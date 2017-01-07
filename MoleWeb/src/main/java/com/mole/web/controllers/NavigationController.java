package com.mole.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigationController {

	@RequestMapping(value = "/")
	public String returnHomePage(){
		return "index";
	}
	
	@RequestMapping(value = "/signup")
	public String returnSignUpPage(){
		return "register";
	}
	
	@RequestMapping(value = "/signin")
	public String returnSignInPage(){
		return "login";
	}
	
	@RequestMapping(value = "/aboutus")
	public String returnAboutUsPage(){
		return "aboutus";
	}
	
	@RequestMapping(value = "/search")
	public String returnsearchPage(){
		return "search";
	}
	
	@RequestMapping(value = "tutorial")
	public String returnTutorialPage(){
		return "tutorial";
	}
	
	@RequestMapping(value = "forum")
	public String returnForumPage(){
		return "forum";
	}
	
	@RequestMapping (value = "/logout")
	public String returnLogOutPage(){
		return "logout";
	}
}


