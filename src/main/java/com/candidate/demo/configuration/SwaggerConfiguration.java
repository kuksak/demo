package com.candidate.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;

public class SwaggerConfiguration {

    private static final String CONTROLLER_BASE_PACKAGE = "com.candidate.demo.controller";

    /**
     * Enables swagger only for the controllers created in defined package
     *
     * @return Docket instance for swagger initialization
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(or(RequestHandlerSelectors.withClassAnnotation(RepositoryRestController.class),
                        basePackage(CONTROLLER_BASE_PACKAGE)))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    /**
     * Add custom api information to be displayed on Swagger page
     *
     * @return ApiInformation for the swagger page
     */
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Candidate Service RESTful API",
                "This API can be used to perform Candidate related CRUD Operations.",
                "1.0-SNAPSHOT",
                "https://github.com/kuksak/demo",
                new Contact("Sakshi Kukreti", "https://github.com/kuksak/demo", "sakshikukreti18@gmail.com"),
                "MIT Open source", "https://github.com/kuksak/demo", Collections.emptyList());
    }
}
