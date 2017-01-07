package com.mole.web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mole.web.utils.AjaxResponseBuilder;
import com.mole.web.vtos.UserDetails;


@Controller
public class MoleAuthController {

	/*private UserServices userServices ;
	
	public UserServices getUserServices() {
		return userServices;
	}

	public void setUserServices(UserServices userServices) {
		this.userServices = userServices;
	}*/

	@RequestMapping(value= "/register",method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String registerController(@ModelAttribute("userDetails") UserDetails user){
		System.out.println("register");
		System.out.println(user.getEmail());
		//userServices.sendMail();
		

		UserDetails details = new UserDetails();
		details.setUserName("success");
		System.out.println(AjaxResponseBuilder.createJSONMessage().toString());
		return AjaxResponseBuilder.createJSONMessage().toString();
	}

	@RequestMapping("/login")
	public String showLogin(){
		return "login";
	}
	


}
