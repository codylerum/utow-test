package com.outjected.utow;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo/xml")
public class DemoXml {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public DemoBean get() {
        return DemoUtils.createDemoBean();
    }
}
