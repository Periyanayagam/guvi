class numberOfDigits{
	 
	
	  public static void main(String[] args){
		  
		  int num;
		  String str,crap;
		  Scanner s = new Scanner(System.in);
		  
		  System.out.println("Enter a number");
		  num = s.nextInt(); 
		  
		  str = String.valueOf(num);
		 
		  char y[] = str.toCharArray();
		  
		  if(str.startsWith("-") || str.startsWith("+")){
			  crap = str.substring(1, y.length);
		  }else{
			  crap = str;
		  }
		  
		  char x[] = crap.toCharArray();

		  System.out.printf("%d contains %d digits",num,x.length);
		  
	  }
} 