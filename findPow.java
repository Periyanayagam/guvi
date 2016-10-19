import java.util.Scanner;

class findPow{
	 
	
	  public static void main(String[] args){
		  
		  int num;
		  Scanner s = new Scanner(System.in);
		  
		  System.out.println("Enter a number");
		  num = s.nextInt(); 
		  
		  System.out.println(Math.pow(num, num));
		  
	  }
} 
	