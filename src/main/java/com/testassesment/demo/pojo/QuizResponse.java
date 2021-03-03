package com.testassesment.demo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuizResponse {

	@JsonProperty("quiz")
	public List<ResQuiz> quiz;

	public List<ResQuiz> getQuiz() {
		return quiz;
	}

	public void setQuiz(List<ResQuiz> quiz) {
		this.quiz = quiz;
	}
	
	
	
}
