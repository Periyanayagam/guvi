
import java.util.Scanner;

class Numbers {
	 
		 public static void main(String [] args) { 
			 
			 System.out.println("Enter a number..");
			 Scanner s = new Scanner(System.in);
			 int a = s.nextInt();
			 String b = String.valueOf(a);
			 
			 if(b.contains("-")){
				 System.out.printf("%d is a negative number",a);
			 }else if(b.equalsIgnoreCase("0")){
				 System.out.println("Entered number is ZERO");
			 }else{
				 System.out.printf("%d is a positive number",a);
			 }
			 
		 }

} 
	

