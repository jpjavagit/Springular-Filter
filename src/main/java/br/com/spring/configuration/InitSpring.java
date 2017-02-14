package br.com.spring.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * This Class is responsible to start the Spring Servlet (DispatcherServlet).
 * 
 * @author jpjava
 *
 */
public class InitSpring extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{SpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}
