package com.constro.app.bo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(HttpStatus.OK)
public class RestCustomException extends RuntimeException {


	public RestCustomException(String exception) {
		super(exception);
	}
}
