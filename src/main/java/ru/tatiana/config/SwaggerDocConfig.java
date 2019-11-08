package ru.tatiana.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;

@Configuration
public class SwaggerDocConfig {

    @Bean
    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Web API toDoList")
                .license("Apache 2.0")
                .termsOfServiceUrl("")
                .contact(new Contact("Radnaeva","", "Radnaeva.T.Z@sberbank.ru"))
                .version("1.0.0")
                .build();
    }
}