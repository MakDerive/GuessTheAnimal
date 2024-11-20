package main;

public class AnimalNode {
	private String question;
	private String animal;
	AnimalNode yes;
	AnimalNode no;
	AnimalNode(String question) {
	        this.question = question;
	        this.animal = null;
	        this.yes = null;
	        this.no = null;
	}
	
	AnimalNode(String animal, boolean isAnimal) {
        this.animal = animal;
        this.question = null;
        this.yes = null;
        this.no = null;
    }
	public String getAnimal() {
		return animal;
	}
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}
	
	
	
	
	
}
