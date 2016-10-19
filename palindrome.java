import java.util.Scanner;

public class palindrome{

	public static void main(String[] args) {
		
		int a,rem,rev = 0,bkp;
		System.out.println("Enter a number...");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		bkp = a;
		while(a>=1){
			rem = a%10;
			rev = rev*10+rem;
			a = a/10;
		}
		
		if(rev==bkp){
			System.out.println("Palindrome number");
		}else{
			System.out.println("Non-Palindrome number");
		}
		
		
	}
	
}
