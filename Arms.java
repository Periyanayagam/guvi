import java.util.Scanner;

public class Arms{

	public static void main(String[] args) {
		
		int a,r=0,bkp;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
	    a = s.nextInt();
	    
	    bkp = a;
	   
	    while(a>0){
	    	int t = a%10;
	    	r = r+(t*t*t);
	    	a = a/10;
	    }
	    
	    if(bkp == r){
	    	System.out.printf("%d is an armstrong number",r);
	    }else{
	    	System.out.printf("%d is not an armstrong number",r);
	    }
		
	}
	
}
