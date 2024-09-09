package org.program;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arraysss {

	  //Merge two arrays
	
	   public static void main(String[] args) {
	
	        int[] a = {1,2,3,4,5};
	        
	        int[] b = {6,7,8,9};
	        
	        int[] c = new int [a.length+b.length];
	        
	         for(int i =0; i<a.length; i++) {
	        	 	
		     c[i]=a[i];
	     }
	         
	         for(int i =0; i<b.length; i++) {
	        	 
	        	 c[i+a.length]=b[i];
	     }
	         
	         for(int i =0; i<c.length; i++) {
	        	 
	        	 System.out.print(c[i]+" ");
	     }
	        	 
	      
     }
  }
