package com.obp.rohit.transaction_processor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.obp.rohit.transaction_processor" })
public class TransactionProcessorConfigurations extends WebMvcConfigurerAdapter {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
