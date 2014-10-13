package ru.artem.cherkasov.algorithms;

import java.util.Map;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Algorithms.reverseLine("ABCD"));
		Map<String, Integer> m = Algorithms.frequencyLetters("ABBCAAA");
		
		for (int i = 0; i < m.size(); ++i){
			System.out.println(m.keySet().toArray()[i] + " " + m.get(m.keySet().toArray()[i]));
		}

	}

}
