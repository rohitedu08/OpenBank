package com.obp.rohit.transaction_processor.application;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.obp.rohit.transaction_processor.model.TransactionVo;

public interface TransactionProcessorApplication {

	public ResponseEntity<List<TransactionVo>> getTransactions();
}
