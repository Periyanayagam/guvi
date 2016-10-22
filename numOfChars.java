import java.util.Scanner;

public class numOfChars{

public static void main(String[] args) {


	String s;
	char[] ch;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter something..");
	s = scan.nextLine();
	ch = s.toCharArray();
	
	System.out.println("Number of character .."+ch.length);
	
}

}
