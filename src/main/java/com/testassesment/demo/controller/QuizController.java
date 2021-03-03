package com.testassesment.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.testassesment.demo.pojo.QuizResponse;
import com.testassesment.demo.resttemplate.RestCall;

@RestController
public class QuizController {

	
	@Autowired
	public RestCall restcall;
	
	
	
	@GetMapping("/coding/exercise/quiz")
	public QuizResponse validateLogin() {
		return restcall.createResponse();
	}
	
}
