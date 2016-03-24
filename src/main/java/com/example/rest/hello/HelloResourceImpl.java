package com.example.rest.hello;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

/**
 * Created by Vladislav on 3/24/2016.
 */

@Component
@Path("/hello")
public class HelloResourceImpl implements HelloResource{

    @GET
    @Produces(TEXT_PLAIN)
    @Override
    public String sayHello(){
        return "HelloWorld";
    }

}
