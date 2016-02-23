package ru.ogify.srs.config;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import jersey.repackaged.com.google.common.collect.ImmutableList;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import ru.ogify.srs.stash.api.StashApiResource;

/**
 * Created by melge on 23.02.2016.
 */
@Configuration
@PropertySource("classpath:srs.properties")
public class SpringConfiguration {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public StashApiResource stashApiResource(
            @Value("${stash.server.url}") String stashServerUrl,
            @Value("${stash.server.username}") String stashServerUsername,
            @Value("${stash.server.password}") String stashServerPassword) {
        return JAXRSClientFactory.create(
                stashServerUrl, StashApiResource.class, ImmutableList.of(new JacksonJaxbJsonProvider()),
                stashServerUsername, stashServerPassword, null
        );
    }
}
