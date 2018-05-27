package com.obp.rohit.transaction_processor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.obp.rohit.transaction_processor.application.TransactionProcessorApplication;
import com.obp.rohit.transaction_processor.model.TransactionVo;

@RestController
public class TransactionController {

	@Autowired
	private TransactionProcessorApplication application;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ResponseEntity<List<TransactionVo>> getTransactions() {

		return application.getTransactions();

	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public void greetings() {

		System.out.println("Hello World");
	}

}
