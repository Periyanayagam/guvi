import java.util.Scanner;

public class wordsinLine{

public static void main(String[] args) {

	int count=1;
	String s;
	char[] ch;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter something..");
	s = scan.nextLine();
	ch = s.toCharArray();
	
	for(int i=0;i<ch.length;i++){
		if(String.valueOf(ch[i]).equals(" ")){
			count++;
		}
	}
	
	System.out.println(count);
	
}

}
