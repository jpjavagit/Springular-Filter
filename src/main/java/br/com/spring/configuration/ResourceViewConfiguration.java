package br.com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ResourceViewConfiguration {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		InternalResourceViewResolver internal = new InternalResourceViewResolver();
		internal.setPrefix("/WEB-INF/views");
		internal.setSuffix(".jsp");
		return internal;
	}
	
}
