package com.mole.web.utils;

import org.json.JSONObject;

public class AjaxResponseBuilder {

	public static JSONObject createJSONMessage(){
		
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("message", "Register Success");
		
		return jsonObject;
	}
}
