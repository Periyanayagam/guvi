import java.util.InputMismatchException;
import java.util.Scanner;

class isAlpha{
	 
	  public static void main(String[]s){
		  
		   System.out.println("Enter something to check alpha or not..!");
		   Scanner sX = new Scanner(System.in);
		  
		   try{
			   int a = sX.nextInt();
			   System.out.println("Input is not an Alpha..!");
		   }catch(InputMismatchException e){
			   System.out.println("Input is an Alpha..!");
		   }
		   
	    }

} 
	

