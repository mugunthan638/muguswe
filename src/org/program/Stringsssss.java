    package org.program;

import java.util.Scanner;

public class Stringsssss {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String rev = s.nextLine();
		String r ="";
		 
		  for(int i = rev.length()-1; i>=0; i--) {
			  
		 r=r+rev.charAt(i);
		 System.out.println(r);
	      
	  }
		  
		  
  }

}
