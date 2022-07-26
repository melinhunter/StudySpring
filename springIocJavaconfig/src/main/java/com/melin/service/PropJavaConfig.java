package com.melin.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @Author Melin Chao
 * @Since 2022/7/25
 */
@PropertySources({
        @PropertySource("classpath:/myconfig.properties"),
        @PropertySource(value = "classpath:/myconfig-${spring.profiles.active}.properties", ignoreResourceNotFound = true),

})
@Configuration
public class PropJavaConfig {
    private String url;

}
