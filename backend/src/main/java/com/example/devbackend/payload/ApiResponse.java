package com.example.devbackend.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse {

	
	private boolean success;
	private String message;
}
