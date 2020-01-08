package com.ethan.swagger2.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: ethan.liu
 * @Date: 2020/1/8 15:10
 */
@EnableSwagger2
@Configuration
@EnableSwaggerBootstrapUI
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //Controller所在包(必须新建包)
                .apis(RequestHandlerSelectors.basePackage("com.ethan"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //接口文档的名字
                .title("demo api")
                //接口文档的描述
                .description("demo api接口文档")
                //服务条款网址
                .termsOfServiceUrl("http://localhost/")
                //接口文档的版本
                .version("1.0.0")
                // 接口文档维护联系信息
                .contact(new Contact("Ethan", "", "690681701@qq.com"))
                .build();
    }
}
