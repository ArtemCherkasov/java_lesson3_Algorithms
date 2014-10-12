package ru.artem.cherkasov.algorithms;

import java.util.HashMap;
import java.util.Map;

public class Algorithms {
	
	public static Integer maxElement(Integer arr[]){
		
		Integer length = arr.length;
		Integer maxElement = arr[0]; 
		
		for (Integer i = 0; i < length; ++i){
			
			if(arr[i] > maxElement){
				
				maxElement = arr[i];
				
			}
			
		}
		
		return maxElement;
		
	}
	
	public static String reverseLine(String line){
		
		String outputLine = "";
		Integer length = line.length();
		
		for (Integer i = 0; i < length; ++i){
			
			outputLine = line.charAt(i) + outputLine;
			
		}
		
		return outputLine;
		
	}
	
	public static Map<String, Integer> frequencyLetters(String line){
		
		Map<String, Integer> outputMap = new HashMap<String, Integer>();
		Integer length = line.length();
		
		for (Integer i = 0; i < length; ++i){
			
			if (!outputMap.containsKey(line.charAt(i))){
				
				Integer count = 0;
				
				for(Integer j = 0; j < length; ++j){
					
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