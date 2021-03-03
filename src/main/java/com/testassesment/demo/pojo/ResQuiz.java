package com.testassesment.demo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResQuiz {

	@JsonProperty("category")
	public String category;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<ResResult> getResults() {
		return results;
	}
	public void setResults(List<ResResult> results) {
		this.results = results;
	}
	@JsonProperty("results")
	public List<ResResult> results;
}
