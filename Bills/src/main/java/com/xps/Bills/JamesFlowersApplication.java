package com.xps.Bills;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;


@SpringBootApplication
public class JamesFlowersApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(JamesFlowersApplication.class, args);
	}
	
	
	  @Bean public FilterRegistrationBean<CorsFilter> corsFilter() {
	  UrlBasedCorsConfigurationSource source = new
	  UrlBasedCorsConfigurationSource(); CorsConfiguration conf = new
	  CorsConfiguration(); conf.setAllowCredentials(true);
	  conf.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
	  conf.setAllowedMethods(Arrays.asList("*"));
	  conf.setAllowedHeaders(Arrays.asList("*"));
	  source.registerCorsConfiguration("/**", conf);
	  FilterRegistrationBean<CorsFilter> bean = new
	  FilterRegistrationBean<CorsFilter>(new CorsFilter(source));
	  bean.setOrder(Ordered.HIGHEST_PRECEDENCE); return bean;
	  
	  }
	 
	 

}
