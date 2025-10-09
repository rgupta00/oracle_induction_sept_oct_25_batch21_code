package com.productapp.controller;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
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
	
//	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessageDto> handle500(Exception ex) {

		//LocalDateTime timeStemp, String message, String statusCode, String toContact
		ErrorMessageDto errorMessageDto=
				new ErrorMessageDto(LocalDateTime.now(), "Pls try after some time",
						HttpStatus.INTERNAL_SERVER_ERROR.toString(), "ravi@oracle.com");
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorMessageDto);
	}
	
	//MethodArgumentNotValidException
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorMessageDto> handle400(MethodArgumentNotValidException ex) {

		String errorMessageString= ex.getBindingResult()
				.getAllErrors()
				.stream()
				.map(e->e.getDefaultMessage())
				.collect(Collectors.joining(" , "));
		
		//LocalDateTime timeStemp, String message, String statusCode, String toContact
		ErrorMessageDto errorMessageDto=
				new ErrorMessageDto(LocalDateTime.now(),errorMessageString,
						HttpStatus.BAD_REQUEST.toString(), "ravi@oracle.com");
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorMessageDto);
	}
}












