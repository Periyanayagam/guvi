package crap;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		String a;
		char b[];
		System.out.println("Enter a string");
		Scanner s = new Scanner(System.in);
		a = s.next();
		b = a.toCharArray();

		for(int i=b.length-1;i>=0;i--){
			System.out.printf("%c",b[i]);
		}
		
		
	}
	
}
