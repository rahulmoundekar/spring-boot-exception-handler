package com.app.controller;

import java.time.LocalDateTime;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import com.app.exception.AgeNotValidException;
import com.app.exception.CustomErrorResponse;

@RestController
public class VoteController {

	/**
	 * @author rahul
	 */
	private static final Logger logger = Logger.getLogger(VoteController.class);

	@SuppressWarnings("rawtypes")
	@RequestMapping("/vote/{age}")
	public ResponseEntity hello(@PathVariable("age") Integer age) throws AgeNotValidException {
		String vote = "";
		if (age < 18) {
			logger.error("Custom Exception Occured here");
			throw new AgeNotValidException("Age is not valid for voting for this System..try after some years..!!!");
		} else {
			logger.error("Your age is valid for For this System");
			vote = "Your age is valid for For this System";
		}
		return new ResponseEntity<>(vote, HttpStatus.OK);
	}

	@ExceptionHandler(AgeNotValidException.class)
	public ResponseEntity<CustomErrorResponse> customHandleNotFound(Exception ex, WebRequest request) {
		CustomErrorResponse errors = new CustomErrorResponse();
		errors.setTimestamp(LocalDateTime.now());
		errors.setError(ex.getMessage());
		errors.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(errors, HttpStatus.NOT_FOUND);
	}

}
