package com.livros.biblioteca.config;

import org.springframework.context.annotation.Bean;

import io.swagger.models.Contact;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig {
	
	@Bean
	public Docket bookApi() {
	    return new Docket(DocumentationType.SWAGGER_2)
	        .select()
	        .apis(RequestHandlerSelectors.basePackage("com.biblioteca"))
	        .paths(regex("/api.*"))
	        .build()
	        .apiinfo(metaInfo());
	}

	private ApiInfo metaInfo() {
	    ApiInfo  apiInfo = new ApiInfo(
	        "Biblioteca",
	        "API REST de cadastro de livros.",
	        "1.0",
	        "Terms of Service",
	        new Contact("Eliude Lima",
	        "eliudefelizindo@gmail.com"),
	        
	        new ArrayList<VendorExtension>()
		);
	return apiInfo;
	}

}
