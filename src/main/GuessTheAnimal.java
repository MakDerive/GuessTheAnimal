package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GuessTheAnimal {
	private static List<Question> list = new ArrayList<Question>();
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(Question question : list) {
			
		}
		String answer = br.readLine();
	}
}
