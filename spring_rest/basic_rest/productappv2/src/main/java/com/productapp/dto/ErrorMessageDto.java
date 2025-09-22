package com.productapp.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorMessageDto {
	private LocalDateTime timeStemp;
	private String message;
	private String statusCode;
	private String toContact;
}
