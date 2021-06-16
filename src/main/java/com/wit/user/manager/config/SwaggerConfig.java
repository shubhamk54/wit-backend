package com.wit.user.manager.config;

import com.wit.user.manager.util.CommonConstants;
import com.wit.user.manager.util.ModuleConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage(ModuleConstants.BASE_CONTROLLER_PACKAGE))
                .paths(PathSelectors.any()).build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(ModuleConstants.SWAGGER_SERVICE_API, ModuleConstants.SWAGGER_SERVICE_OPERATION,
                CommonConstants.SWAGGER_VERSION, CommonConstants.SWAGGER_SERVICE_TERMS,
                new Contact(CommonConstants.DEV_TEM, CommonConstants.DEV_TEAM_CONTACT, CommonConstants.DEV_TEAM_CONTACT),
                CommonConstants.PRODUCT_LICENSE, CommonConstants.SWAGGER_LICENSE_URL, Collections.emptyList());
    }
}