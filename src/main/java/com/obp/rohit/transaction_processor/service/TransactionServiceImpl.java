package com.obp.rohit.transaction_processor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.obp.rohit.transaction_processor.model.Transaction;
import com.obp.rohit.transaction_processor.obpclient.OBPClient;

public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private OBPClient client;

	public List<Transaction> getTransactions() {

		return client.getTransactions();

	}

}
