import java.util.Scanner;

public class oDD{

	public static void main(String[] args) {
		
		int a,b;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number...");
		a = s.nextInt();
	
		System.out.println("Enter another number...");
		b = s.nextInt();
	
		for(int i=a;i<b;i++){
			
			if(i%2==1){
				System.out.println(i);
			}
			
		}
		
	}
	
}