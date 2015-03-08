package com.fm.servlet;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class FMResponse {
	private JSONObject jsonObject=new JSONObject();
	private HttpServletResponse response;
	public FMResponse(HttpServletResponse response) {
		this.response=response;
		response.setContentType("text/html;charset=UTF-8");
	}
	public JSONObject getJsonObject(){
		return jsonObject;
	}
	
}
