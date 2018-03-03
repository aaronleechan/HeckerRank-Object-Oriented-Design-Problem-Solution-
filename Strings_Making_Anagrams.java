package ObjectOrientedProgramming;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Strings_Making_Anagrams {
	
	
	public static int numberNeeded(String first, String second) {
		int value = 0;
		
		ArrayList<Character> firstValue = new ArrayList<>();
		ArrayList<Character> secondArray = new ArrayList<>();
		char[] f = first.toCharArray();
		char[] s = second.toCharArray();
		
		for(Character v : f){
			firstValue.add(v);
		}
		
		for(Character z : s){
			
			if(firstValue.contains(z)){
				firstValue.remove(z);
			}else{
				secondArray.add(z);
			}
		}
	
		value = firstValue.size() + secondArray.size();
		
        return value;
    }
  
    public static void main(String[] args) {
        
        String a = "fcrxzwscanmligyxyvym";
        String b =  "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        
        System.out.println(numberNeeded(a, b));
        System.out.println( " Expected Result: " + 30);
    }
	

}
