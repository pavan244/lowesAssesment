package com.testassesment.demo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResResult {

	@JsonProperty("type")
	 public String  type;
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
	public List<String> getAll_answers() {
		return all_answers;
	}
	public void setAll_answers(List<String> all_answers) {
		this.all_answers = all_answers;
	}
	public String getCorrect_answer() {
		return correct_answer;
	}
	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}
	@JsonProperty("difficulty")
	 public String difficulty;
	@JsonProperty("question")
	 public String  question;
	@JsonProperty("all_answers")
     public List<String> all_answers;
	@JsonProperty("correct_answer")
     public String correct_answer;
	
	
	
}
