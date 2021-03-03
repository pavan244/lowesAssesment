package com.testassesment.demo.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quiz {

	@JsonProperty("response_code")
	public String response_code;
	@JsonProperty("results")
	public List<Result> results;
	public String getResponse_code() {
		return response_code;
	}
	public void setResponse_code(String response_code) {
		this.response_code = response_code;
	}
	public List<Result> getResults() {
		return results;
	}
	public void setResults(List<Result> results) {
		this.results = results;
	}
	
	
	
	
}
