package com.tang.tiny.config;

import com.tang.tiny.common.config.BaseSwaggerConfig;
import com.tang.tiny.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by Tang on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.tang.tiny.modules")
                .title("tang-server-tiny项目骨架")
                .description("tang-server-tiny项目骨架相关接口文档")
                .contactName("Tang")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
