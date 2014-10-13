package ru.artem.cherkasov.algorithms;

import java.lang.reflect.Field;
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
		
		String outputLine = "";
		Field[] fields = line.getClass().getDeclaredFields();
		Field value = null;
		
		for(int i=0; i<fields.length; i++){
			
            Field field = fields[i];
            if (field.getType().equals(char[].class)){
                value = field;
                break;
            }
            
        }
		
		value.setAccessible(true);
		char[] charValue;
		try {
			
			charValue = (char[])value.get(line);
			
			for(int i=0; i<charValue.length/2; i++ ){
	            char tmp=charValue[i];
	            charValue[i] = charValue[charValue.length-1-i];
	            charValue[charValue.length-1-i] = tmp;
	        }
			
	        value.set(outputLine, charValue);
	        
		} catch (IllegalArgumentException e) {

		} catch (IllegalAccessException e) {
;
		}
		
		return outputLine;
		
	}
	
	public static Map<String, Integer> frequencyLetters(String line){
		
		Map<String, Integer> outputMap = new HashMap<String, Integer>();
		int length = line.length();
		
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