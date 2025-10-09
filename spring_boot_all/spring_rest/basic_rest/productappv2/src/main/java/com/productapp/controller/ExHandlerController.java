package com.productapp.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.productapp.dto.ErrorMessageDto;
import com.productapp.exceptions.ProductNotFoundException;

@RestControllerAdvice
public class ExHandlerController {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorMessageDto> handle404(ProductNotFoundException ex) {

		//LocalDateTime timeStemp, String message, String statusCode, String toContact
		ErrorMessageDto errorMessageDto=
				new ErrorMessageDto(LocalDateTime.now(), ex.getMessage(),
						HttpStatus.NOT_FOUND.toString(), "ravi@oracle.com");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessageDto);
	}
}












