import java.util.Scanner;

class sumOfN{
	 
	
	  public static void main(String[] args){
		  
		  int sum=0, size;
		  Scanner s = new Scanner(System.in);
		  System.out.println("Enter size..");
		  size = s.nextInt(); 
		  
		  System.out.printf("Enter %d number \n",size);
		  for(int i=0;i<size;i++){
			sum += s.nextInt();
		  }
		  System.out.printf("Sum of %d number is %d",size,sum);
		  
	  }
} 
	