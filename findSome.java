import java.util.Scanner;

public class findSome{

public static void main(String[] args) {

	Scanner s = new Scanner(System.in);
	System.out.println("Enter a String");
	String str = s.nextLine();
	
	int alpha=0,num=0,sym=0;
	
	char my[] = str.toCharArray();
	
	for(int i=0;i<my.length;i++){
		
		int ascii = my[i];
		if(ascii > 65 && ascii <122){
			alpha++;
		}else if(ascii>48 && ascii < 58){
			num++;
		}else{
			sym++;
		}
		
	}
	System.out.println("Characters in the input..."+my.length);
	System.out.println("Alphabets in the input..."+alpha);
	System.out.println("Numbers in the input..."+num);
	System.out.println("Symbols in the input..."+sym);
}

}
