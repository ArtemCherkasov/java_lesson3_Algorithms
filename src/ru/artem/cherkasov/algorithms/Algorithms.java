package ru.artem.cherkasov.algorithms;

import java.util.HashMap;
import java.util.Map;

public class Algorithms {
	
	public static Integer maxElement(Integer arr[]){
		
		int length = arr.length;
		int maxElement = arr[0]; 
		
		for (Integer i = 0; i < length; ++i){
			if(arr[i] > maxElement){
				maxElement = arr[i];
			}
		}
		
		return maxElement;
		
	}
	
	public static String reverseLine(String line){
		
		StringBuilder sBuilder = new StringBuilder();
		int length = line.length();
		System.out.println(length);
		
		for (int i = length - 1; i >= 0; --i){
			sBuilder.append(line.charAt(i));
			System.out.println(line.charAt(i));
		}
		
		System.out.println(sBuilder.length());
		return sBuilder.toString();
		
	}
	
	public static Map<String, Integer> frequencyLetters(String line){
		
		Map<String, Integer> outputMap = new HashMap<String, Integer>();
		int length = line.length();
		
		for (int i = 0; i < length; ++i){
			if (!outputMap.containsKey(line.charAt(i))){
				int count = 0;
				for(int j = 0; j < length; ++j){
					if (line.charAt(i) == line.charAt(j)){
						++count;
					}
				}
				outputMap.put(String.valueOf(line.charAt(i)), count);
			}
			
		}
		
		return outputMap;
	}

}