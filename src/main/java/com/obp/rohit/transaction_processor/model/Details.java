package com.obp.rohit.transaction_processor.model;

public class Details {

	private String type;
	private String description;
	private Value value;

	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(final Value value) {
		this.value = value;
	}

}
