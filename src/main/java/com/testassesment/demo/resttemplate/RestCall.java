package com.testassesment.demo.resttemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.testassesment.demo.pojo.Quiz;
import com.testassesment.demo.pojo.QuizResponse;
import com.testassesment.demo.pojo.ResQuiz;
import com.testassesment.demo.pojo.ResResult;
import com.testassesment.demo.pojo.Result;

@Component
public class RestCall {

	@Autowired
	public RestTemplate resttemplate;
	
	
	public Quiz getQuiz()
	{
		Quiz q =resttemplate.getForObject(
				"https://opentdb.com/api.php?amount=5&category=11", Quiz.class);
		Quiz q1 =resttemplate.getForObject(
				"https://opentdb.com/api.php?amount=5&category=12", Quiz.class);
		List<Result> a1 = q1.getResults();
		List<Result> a = q.getResults();
		for(Result r:a1)
		{
			a.add(r);
			System.out.println(r.category);
		}
		return q;
	}
	/*
	 type
     difficulty
     question
     all_answers: 
     correct_answer
	*/
	public QuizResponse createResponse()
	{
		QuizResponse quizResp = new QuizResponse();
		Quiz q = getQuiz();
		List<Result> quizList = q.getResults();
		HashMap<String,ArrayList<ResResult>> hm = new HashMap<String,ArrayList<ResResult>>();
		for(Result r:quizList)
		{
			ResResult resResult = new ResResult();
			resResult.setType(r.getType());
			resResult.setDifficulty(r.getDifficulty());
			resResult.setQuestion(r.getQuestion());
			   ArrayList<String> allAns = new ArrayList<String>(r.getIncorrect_answers());
			   allAns.add(r.getCorrect_answer());
			resResult.setAll_answers(allAns);
			resResult.setCorrect_answer(r.getCorrect_answer());
			if(!hm.containsKey(r.getCategory()))
		  	{
				ArrayList<ResResult> al = new ArrayList<ResResult>();
				hm.put(r.getCategory(), al);	
		  	}
			hm.get(r.getCategory()).add(resResult);
		}
		
		List<ResQuiz> respQuizList = new ArrayList<ResQuiz>();
		Set<String> categorySet = hm.keySet();
		for(String category:categorySet)
		{
			ResQuiz rq = new ResQuiz();
			rq.setCategory(category);
			rq.setResults(hm.get(category));
			respQuizList.add(rq);
		}
		quizResp.setQuiz(respQuizList);
		return quizResp;
	}
	
	
	
	
	
	
	
	
	
}
