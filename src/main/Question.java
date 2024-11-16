package main;

import java.util.List;

public class Question {
	private String question;
	private boolean answer;
	private List<Animal> animals;
	
	public Question(String question, boolean answer,Animal animal) {
		this.question = question;
		this.answer = answer;
		animals.add(animal);
	}

	public String getQuestion() {
		return question;
	}

	public boolean isAnswer() {
		return answer;
	}

	
	
}
