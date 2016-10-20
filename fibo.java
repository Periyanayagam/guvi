import java.util.Scanner;

public class fibo{

public static void main(String[] args) {
		
		int num,t1=0,t2=1,disp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit");
		num = scan.nextInt();
		
		for(int i=0;i<num;i++){
			disp = t1+t2;
			t1 = t2;
			t2 = disp;
			System.out.printf("%d,",disp);
		}
	}

}
