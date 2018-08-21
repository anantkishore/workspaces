package com.kishore.anant;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorld {

    @GET
    @Path("/{param}")
    public Response getGreeting(@PathParam("param") String name)

    {
        return Response.status(200).entity("Hello "+name).build();

    }


}
