import java.util.Scanner;

public class sumToN{

public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	int num,res=0;
	System.out.println("Enter a number..");
	num = s.nextInt();
	
	for(int i=1;i<=num;i++){
		res += i;
	}
	System.out.println(res);
	
}

}
