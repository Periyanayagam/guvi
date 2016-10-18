import java.util.Scanner;

class isLeap{
	 
	  public static void main(String[] args){
		 
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the year");
		int a = s.nextInt();
		
		if(a%4==0){
			System.out.printf("%d is a leap year",a);
		}else{
			System.out.printf("%d is not a leap year",a);
		}
		
	    }
} 
	