package com.users.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.users.model.ErrorDetailsVo;

@RestControllerAdvice
public class RestControllerExceptionhandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { DuplicateuserException.class })
	protected ResponseEntity<Object> handleConflict(RuntimeException ex, WebRequest request) {
		ErrorDetailsVo errorDetailsVo = new ErrorDetailsVo();
		errorDetailsVo.setErrorCode("1001");
		errorDetailsVo.setErrorMessage(ex.getMessage());
		return new ResponseEntity<>(errorDetailsVo, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
