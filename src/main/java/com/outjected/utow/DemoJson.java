package com.outjected.utow;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo/json")
public class DemoJson {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DemoBean get() {
        return DemoUtils.createDemoBean();
    }
}
