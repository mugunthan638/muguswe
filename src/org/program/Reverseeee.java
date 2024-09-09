package org.program;

public class Reverseeee {
	
	public static void main(String[] args) {
		
//		  String s = "Testing Manual";
//	  String sp[]=s.split(" ");
//	  
//		  System.out.println("String Reverse in Words");
//		  System.out.println("Orginal String : " + s);
//		  
//		  
//		  System.out.println("\n");		   
//	      System.out.println("Reverse String");
//			   
//		  for(int i = sp.length-1; i>=0; i--) {
//		   
//	     System.out.print( sp[i] + " ");
//	    
//	}
	  System.out.println("\n");	  
	  System.out.println("String Reverse in Letters");
		  
		  String  s = "MADAM";
		  String  reverse ="";
		  
		  
		  for(int i = s.length()-1; i>=0; i--) {
			  
		  reverse = reverse+s.charAt(i);
	  }
		  if (s.equals(reverse)) {
			System.out.println("Palindrome");
		}
		  else {
			System.out.println("Not Palindrome");
		}
	     
	}

}
