package br.com.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan(basePackages={"br.com.spring"})
public class SpringConfiguration {
	
	
}
