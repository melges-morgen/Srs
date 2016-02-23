package ru.ogify.srs.rest;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages(JerseyConfig.class.getPackage().toString());
    }
}
