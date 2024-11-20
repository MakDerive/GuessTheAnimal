package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;



public class GuessTheAnimal {
	
	private static AnimalNode root;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	root = new AnimalNode("Это животное живет на суше?");
        root.yes = new AnimalNode("кот", true);
        root.no = new AnimalNode("кит", true);
        
    	while (true) {
    		AnimalNode currentNode = root;
    		while (true) {
                System.out.println(currentNode.getQuestion());
                if (br.readLine().equals("да")) {
                	String guessAnimal = currentNode.yes.getAnimal();
    				System.out.println("Ваше животное " + guessAnimal + "?");
    				if (br.readLine().equals("да")) {
    					break;
    				}
    				currentNode = currentNode.yes;
    				if (currentNode.getQuestion()==null) {
    					System.out.println("Какое животное ты загадал?");
    					currentNode.setAnimal(br.readLine());
        				System.out.println("Чем "+ currentNode.getAnimal() +" отличается от " + guessAnimal);
        				currentNode.setQuestion(br.readLine());
        				break;
    				}
    			} else {
    				String guessAnimal = currentNode.no.getAnimal();
    				System.out.println("Ваше животное " + guessAnimal + "?");
    				if (br.readLine().equals("да")) {
    					break;
    				}
    				currentNode = currentNode.no;
    				if(currentNode.getQuestion()==null) {
    					System.out.println("Какое животное ты загадал?");
    					currentNode.setAnimal(br.readLine());
        				System.out.println("Чем "+ currentNode.getAnimal() +" отличается от " + guessAnimal);
        				currentNode.setQuestion("Ваше животное" + br.readLine() + "?");
        				break;
    				}
    			}
                
    		}
    		System.out.println("Хотите сыграть еще раз?");
    		if (br.readLine().equals("нет")) {
				break;
			}
		}
	}
}