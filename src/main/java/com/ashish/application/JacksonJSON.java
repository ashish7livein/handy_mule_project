package com.ashish.application;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.ashish.application.model.User;


public class JacksonJSON {
 
	public static void main (String args[]) throws JsonGenerationException, JsonMappingException, IOException {
		User usr = new User();
		usr.setId("507");
		usr.setName("ashish");
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(usr));
	}
}
