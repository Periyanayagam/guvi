import java.util.Scanner;

public class MultiplyX{

public static void main(String[] args) {
		
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		num = scan.nextInt();
		
		for(int i=1;i<=10;i++){
			
			System.out.printf("%d * %d = %d\n",i,num,(i*num));
			
		}
	}

}
