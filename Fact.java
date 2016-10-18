import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		
		int a,res=1;
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();

		for(int i=a;i>0;i--){
			res *= i;
		}
		
		System.out.println(res);
	}
	
}
