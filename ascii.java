public class ascii{

public static void main(String[] args) {
	System.out.println("\n SYMBOLS ");	
	for (int c=33; c<47; c++) {
	    System.out.printf("[%d : %c],",c,(char)c);
	   } 
	
	System.out.println("\n\n NUMBERS ");
	for(int c=48;c<58;c++){
	    System.out.printf("[%d : %c],",c,(char)c);
	}
	
	System.out.println("\n\n ALPHABETS ");
	for(int c=65;c<123;c++){
	    System.out.printf("[%d : %c],",c,(char)c);   
	}
		
	}

}