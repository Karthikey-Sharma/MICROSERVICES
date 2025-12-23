package com.microservicescourse.restfulwebservices.config;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    // this will be through query parameter
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.favorParameter(true)
                .parameterName("mediaType")
                .defaultContentType(MediaType.APPLICATION_JSON)
                .ignoreAcceptHeader(true)
                .mediaType("xml", MediaType.APPLICATION_XML)
                .mediaType("json" , MediaType.APPLICATION_JSON);
    }

}
