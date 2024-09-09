package org.program;

public class StringVowelsCounts {

	public static void main(String[] args) {
		 
		    //With Using Loop
		
		    String s = "E I A U O";
		    String l = s.toLowerCase();		    
	        int count = 0; 
	        System.out.println("vowels words");
	        
	        // check if char[i] is vowel
	        for (int i = 0; i < s.length(); i++) {
	        	if (
				l.charAt(i)== 'a'
				||l.charAt(i)== 'e'
				||l.charAt(i)== 'i'
				||l.charAt(i)== 'o'
				||l.charAt(i)== 'u'){
					
				System.out.print(l.charAt(i)+ "  ");
				
	             // Count increments in vowels
	                count++;
	               
				 }
	        	} 
	        System.out.println("\n");
	        
	        System.out.println("vowls count : " +count);
	        
	        
        } 
    }