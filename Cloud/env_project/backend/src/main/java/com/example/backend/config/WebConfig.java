package com.example.backend.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  // 클라이언트 주소(CLIENT_ORIGIN)를 환경 변수로 대체한다.
	String clientOrigin = "http://localhost:5173";

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins(clientOrigin)
				.allowedMethods("GET", "POST")
				.allowedHeaders("*")
				.allowCredentials(true);
	}
}