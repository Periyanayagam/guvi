import java.util.Scanner;

public class exceptQ{

public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	System.out.println("Enter Something except Q");
	String str = s.nextLine();

	while(!(str.equals("Q"))){
		System.out.println("Enter Something except Q");
		str = s.nextLine();
	}
	
}

}
