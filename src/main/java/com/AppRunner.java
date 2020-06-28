package com;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.model.ErrorModel;

public class AppRunner {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		try {
			
			Object obj = parser.parse(new FileReader("D:\\mars_workspace\\error_demo\\src\\main\\resources\\error_codes.json"));
 
			JSONObject jsonObject = (JSONObject) obj;
 
			JSONObject error = (JSONObject) jsonObject.get("DATA_NOT_FOUND");
			
			  String json_string = new Gson().toJson(error);
			  System.out.println(json_string);
			  
			  ErrorModel myPojo = new Gson().fromJson(json_string, ErrorModel.class);
			  
			System.out.println(myPojo.getDescription());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}