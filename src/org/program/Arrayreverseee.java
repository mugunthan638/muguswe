package org.program;

import java.util.Arrays;

public class Arrayreverseee {
	
	
	public static void main(String[] args) {
	

    int[] a = { 1, 2, 3, 4, 5 };

    // Using inbuilt method in Java
    int[] reverse = new int [a.length];
    
    for (int i = 0; i < a.length; i++) {
    	
        reverse[i] = a[a.length-1-i];
    }
    
    for (int i = 0; i < reverse.length; i++) {
    	
    	
    	  System.out.print(reverse[i]+" ");
    	  
    }
   
    
   }
 }
