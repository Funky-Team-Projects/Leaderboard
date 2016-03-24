package com.example.config;

import com.example.rest.RestResource;
import com.example.rest.hello.HelloResourceImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

/**
 * Created by Vladislav on 3/24/2016.
 */

@Configuration
@ApplicationPath(RestResource.API_PATH)
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(HelloResourceImpl.class);
    }
}
