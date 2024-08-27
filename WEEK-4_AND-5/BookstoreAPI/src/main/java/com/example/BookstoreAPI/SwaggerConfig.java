package com.example.BookstoreAPI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springdoc.core.GroupedOpenApi;
import org.springdoc.webmvc.api.OpenApiWebMvcResource;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi booksApi() {
        return GroupedOpenApi.builder()
                .group("books")
                .pathsToMatch("/books/**")
                .build();
    }
}
