package com.obp.rohit.transaction_processor.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exceptionHandler(final Exception ex) {
		HttpStatus httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
		ErrorResponse errorResponse = new ErrorResponse();
		if (ex instanceof TransactionProcessorException) {
			httpStatus = ((TransactionProcessorException) ex).getStatus();
			errorResponse.setErrorCode(((TransactionProcessorException) ex).getCode());
		}
		errorResponse.setMessage(ex.getMessage());
		return new ResponseEntity<String>("", httpStatus);
	}
}