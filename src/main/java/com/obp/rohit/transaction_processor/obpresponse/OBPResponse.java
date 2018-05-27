package com.obp.rohit.transaction_processor.obpresponse;

import java.util.List;

import com.obp.rohit.transaction_processor.model.Transaction;

public class OBPResponse {

	private List<Transaction> transactions;

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(final List<Transaction> transactions) {
		this.transactions = transactions;
	}

}
