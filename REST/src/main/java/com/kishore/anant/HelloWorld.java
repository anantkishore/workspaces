package com.kishore.anant;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("HelloWorld")
public class HelloWorld {
	
	@GET
	public String getMessage()
	{
		return "Hello World";
	}
}