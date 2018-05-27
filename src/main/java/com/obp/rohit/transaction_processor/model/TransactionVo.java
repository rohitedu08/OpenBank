package com.obp.rohit.transaction_processor.model;

import java.math.BigDecimal;

public class TransactionVo {

	private String id;
	private String accountId;
	private String counterpartyAccount;
	private String counterpartyName;
	private String counterPartyLogoPath;
	private BigDecimal instructedAmount;
	private String instructedCurrency;
	private BigDecimal transactionAmount;
	private String transactionCurrency;
	private String transactionType;
	private String description;

	public String getId() {
		return id;
	}

	public void setId(final String id) {

		this.id = id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(final String accountId) {
		this.accountId = accountId;
	}

	public String getCounterpartyAccount() {
		return counterpartyAccount;
	}

	public void setCounterpartyAccount(final String counterpartyAccount) {
		this.counterpartyAccount = counterpartyAccount;
	}

	public String getCounterpartyName() {
		return counterpartyName;
	}

	public void setCounterpartyName(final String counterpartyName) {
		this.counterpartyName = counterpartyName;
	}

	public String getCounterPartyLogoPath() {
		return counterPartyLogoPath;
	}

	public void setCounterPartyLogoPath(final String counterPartyLogoPath) {
		this.counterPartyLogoPath = counterPartyLogoPath;
	}

	public BigDecimal getInstructedAmount() {
		return instructedAmount;
	}

	public void setInstructedAmount(final BigDecimal instructedAmount) {
		this.instructedAmount = instructedAmount;
	}

	public String getInstructedCurrency() {
		return instructedCurrency;
	}

	public void setInstructedCurrency(final String instructedCurrency) {
		this.instructedCurrency = instructedCurrency;
	}

	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(final BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionCurrency() {
		return transactionCurrency;
	}

	public void setTransactionCurrency(final String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(final String transactionType) {
		this.transactionType = transactionType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

}
