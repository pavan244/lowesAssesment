package com.testassesment.demo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {

	@JsonProperty("category")
	public String category;
	@JsonProperty("type")
	public String type;
	@JsonProperty("difficulty")
	public String difficulty;
	@JsonProperty("question")
	public String question;
	@JsonProperty("correct_answer")
	public String correct_answer;
	@JsonProperty("incorrect_answers")
	public List<String> incorrect_answers;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getCorrect_answer() {
		return correct_answer;
	}
	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}
	public List<String> getIncorrect_answers() {
		return incorrect_answers;
	}
	public void setIncorrect_answers(List<String> incorrect_answers) {
		this.incorrect_answers = incorrect_answers;
	}
	
}
