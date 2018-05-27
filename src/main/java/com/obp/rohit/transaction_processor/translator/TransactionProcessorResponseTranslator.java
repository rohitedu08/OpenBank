package com.obp.rohit.transaction_processor.translator;

import com.obp.rohit.transaction_processor.model.Transaction;
import com.obp.rohit.transaction_processor.model.TransactionVo;

public class TransactionProcessorResponseTranslator {

	public TransactionVo translate(final Transaction transaction) {

		final TransactionVo vo = new TransactionVo();
		vo.setId(transaction.getId());
		vo.setAccountId(transaction.getAccount().getId());
		vo.setCounterpartyAccount(transaction.getOtherAccount().getNumber());
		vo.setCounterpartyName(transaction.getOtherAccount().getHolder().getName());
		vo.setCounterPartyLogoPath(transaction.getOtherAccount().getMetadata().getUrl());
		vo.setInstructedAmount(transaction.getDetails().getValue().getAmount());
		vo.setInstructedCurrency(transaction.getDetails().getValue().getCurrency());
		vo.setTransactionAmount(transaction.getDetails().getValue().getAmount());
		vo.setTransactionCurrency(transaction.getDetails().getValue().getCurrency());
		vo.setTransactionType(transaction.getDetails().getType());
		vo.setDescription(transaction.getDetails().getDescription());

		return vo;
	}

}
