package JavaPractice.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashSet {

	public static void main(String[] args) {
		

		
		
		HashMap<String,String> hm = new HashMap<>();
		
		
		hm.put("india","Delhi");
		hm.put("China", "bejing");
		hm.put("USA", "DC");
		
		
		
		for(String i:hm.keySet()) {
			System.out.println(i+" "+hm.get(i));
		}
	
			
		
		
		 String input = "meemee";
	        Map<Character, Integer> map = new HashMap<>();

	        for (char ch : input.toCharArray()) {
	            if (map.containsKey(ch)) {
	                map.put(ch, map.get(ch) + 1);
	            } else {
	                map.put(ch, 1);
	            }
	        }

		    
	        
	        for(Character j:map.keySet()) {
	        	
	        	if(map.get(j) >=4) {
	        		System.out.print(j+" printed "+ map.get(j)+" time");
	        	}
	        	
	        }
		
		

	}

}
