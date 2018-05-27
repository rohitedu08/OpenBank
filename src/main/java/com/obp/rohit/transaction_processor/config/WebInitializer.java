package com.obp.rohit.transaction_processor.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class[] getRootConfigClasses() {
		return new Class[] { TransactionProcessorConfigurations.class };
	}

	@Override
	protected Class[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	// @Override
	// protected Filter[] getServletFilters() {
	// final Filter[] singleton = { new CORSFilter() };
	// return singleton;
	// }
}