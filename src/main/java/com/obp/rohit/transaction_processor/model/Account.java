package com.obp.rohit.transaction_processor.model;

public class Account {

	private String id;
	private Holder holder;
	private Metadata metadata;
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(final String accountNumber) {
		this.number = accountNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public Holder getHolder() {
		return holder;
	}

	public void setHolder(final Holder holder) {
		this.holder = holder;
	}

	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(final Metadata metadata) {
		this.metadata = metadata;
	}

}
