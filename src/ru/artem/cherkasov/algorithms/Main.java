package ru.artem.cherkasov.algorithms;

import java.util.Map;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = {45,34};
		
		for (int i = 0; i < 10; ++i){
			
			a[i] = new Random().nextInt(1000);
			
		}
		
		
		Map<String, Integer> m = Algorithms.frequencyLetters("ABBCAAA");
		
		for (int i = 0; i < m.size(); ++i){
			
			System.out.println(m.keySet().toArray()[i] + " " + m.get(m.keySet().toArray()[i]));
			
		}

	}

}
