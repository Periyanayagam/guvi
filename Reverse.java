package crap;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		int a,rem,rev = 0;
		System.out.println("Enter a number to reverse..");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();

		while(a>=1){
			rem = a%10;
			rev = rev*10+rem;
			a = a/10;
		}
		
		System.out.println(rev);
	}
	
}
