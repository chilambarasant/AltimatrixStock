package com.altimatrix.stock.exception;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExceptionResponse {

	private String errorMessage;
	private String requestedURI;
}
