package com.obp.rohit.transaction_processor.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {

	private String id;
	private Account account;
	private Account otherAccount;
	private Details details;

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	@JsonProperty("this_account")
	public void setAccount(final Account account) {
		this.account = account;
	}

	public Details getDetails() {
		return details;
	}

	public void setDetails(final Details details) {
		this.details = details;
	}

	public Account getOtherAccount() {
		return otherAccount;
	}

	@JsonProperty("other_account")
	public void setOtherAccount(final Account otherAccount) {
		this.otherAccount = otherAccount;
	}

}
