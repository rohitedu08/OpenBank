package com.obp.rohit.transaction_processor.obpclient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.obp.rohit.transaction_processor.model.Transaction;

@Component
public class OBPClient {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${obp.uri}")
	private String obpUri;

	@Bean
	public List<Transaction> getTransactions() {
		ResponseEntity<List<Transaction>> response = null;

		try {
			response = restTemplate.exchange(obpUri, HttpMethod.GET, null,
					new ParameterizedTypeReference<List<Transaction>>() {
					});
		} catch (final Exception ex) {
			ex.printStackTrace();
		}
		return response.getBody();
	}

}
