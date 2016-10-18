package crap;

import java.util.Scanner;

class oddOrEven{
	 
		 public static void main(String [] args) { 
			 
			 System.out.println("Enter a number..");
			 Scanner s = new Scanner(System.in);
			 int a = s.nextInt();
			 
			 if(a%2==0){
				 System.out.printf("%d is an even number",a);
			 }else{
				 System.out.printf("%d is an odd number",a);
			 }
			 
			 
		 }

} 
	

