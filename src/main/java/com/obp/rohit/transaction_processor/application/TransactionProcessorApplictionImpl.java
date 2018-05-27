package com.obp.rohit.transaction_processor.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.obp.rohit.transaction_processor.model.Transaction;
import com.obp.rohit.transaction_processor.model.TransactionVo;
import com.obp.rohit.transaction_processor.service.TransactionService;
import com.obp.rohit.transaction_processor.translator.TransactionProcessorResponseTranslator;

public class TransactionProcessorApplictionImpl implements TransactionProcessorApplication {

	@Autowired
	private TransactionProcessorResponseTranslator translator;

	@Autowired
	private TransactionService service;

	public ResponseEntity<List<TransactionVo>> getTransactions() {

		final List<TransactionVo> vos = new ArrayList<TransactionVo>();
		final List<Transaction> transactions = service.getTransactions();

		for (final Transaction transaction : transactions) {
			vos.add(translator.translate(transaction));
		}

		return new ResponseEntity<List<TransactionVo>>(vos, HttpStatus.OK);

	}

}
