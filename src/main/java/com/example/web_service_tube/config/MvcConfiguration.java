package com.example.web_service_tube.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfiguration implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /* '/js/**'로 호출하는 자원은 '/static/js/' 폴더 아래에서 찾는다. */
        registry.addResourceHandler("/js_script/**").addResourceLocations("classpath:/static/js_script/").setCachePeriod(60 * 60 * 24 * 365);
        /* '/css/**'로 호출하는 자원은 '/static/css/' 폴더 아래에서 찾는다. */
        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/").setCachePeriod(60 * 60 * 24 * 365);
        /* '/img/**'로 호출하는 자원은 '/static/img/' 폴더 아래에서 찾는다. */
        registry.addResourceHandler("/Img/**").addResourceLocations("classpath:/static/Img/").setCachePeriod(60 * 60 * 24 * 365);
//        /* '/font/**'로 호출하는 자원은 '/static/font/' 폴더 아래에서 찾는다. */
//        registry.addResourceHandler("/font/**").addResourceLocations("classpath:/static/font/").setCachePeriod(60 * 60 * 24 * 365);
    }
}
