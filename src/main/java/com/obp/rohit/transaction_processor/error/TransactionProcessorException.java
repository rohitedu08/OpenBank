package com.obp.rohit.transaction_processor.error;

import org.springframework.http.HttpStatus;

public class TransactionProcessorException extends RuntimeException {

	private static final long serialVersionUID = -7360940660712215283L;
	private final HttpStatus status;
	private final String code;

	public TransactionProcessorException(final String code, final String message) {
		super(message);
		status = HttpStatus.INTERNAL_SERVER_ERROR;
		this.code = code;
	}

	public TransactionProcessorException(final HttpStatus status, final String code, final String message) {
		super(message);
		this.status = status;
		this.code = code;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public String getCode() {
		return code;
	}

}
