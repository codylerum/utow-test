package com.outjected.utow;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo/string")
public class DemoString {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Hello";
    }
}
