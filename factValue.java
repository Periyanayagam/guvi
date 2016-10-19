import java.util.Scanner;

public class factValue{

public static void main(String[] args) {
		
		int num,res=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		num = scan.nextInt();
		
		for(int i=num;i>1;i--){
			res *= i;
		}
		
		System.out.printf("Factorial value of %d is %d",num,res);
	}

}
