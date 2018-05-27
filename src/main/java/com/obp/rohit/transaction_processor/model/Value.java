package com.obp.rohit.transaction_processor.model;

import java.math.BigDecimal;

public class Value {

	private String currency;
	private BigDecimal amount;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(final String currency) {
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(final BigDecimal amount) {
		this.amount = amount;
	}

}
