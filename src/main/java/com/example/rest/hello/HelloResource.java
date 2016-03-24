package com.example.rest.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

/**
 * Created by Vladislav on 3/24/2016.
 */

public interface HelloResource {

    @GET
    @Produces(TEXT_PLAIN)
    @Path("/hello")
    String sayHello();
}
