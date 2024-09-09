package org.program;

public class Numberssss {

	public static void main(String[] args) {
	
	   int num = 123;
	   int rem = 0;
	   int rev = 0;
	   
	  
	   
	   while (num > 0) {
		   
		   
		   rem =num %10;
		   
		   rev = rev+ (rem*rem*rem);
		   
		   num =num/10;		   
		   
		
	}
	   System.out.println(rev);
	  
//   if (n == rev) { 
//	   
//	   System.out.println("It is a palindrome");
//
//}
//	   else {
//		   System.out.println("It is not a palindrome");

	}
 }

