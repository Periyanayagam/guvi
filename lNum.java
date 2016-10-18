class lNum{
	 
	  public static void main(String[] args){
		 
		 int a[] = new int[3];
		 int larger = 0;
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter 3 numbers..");
		 
		 for(int i=0;i<a.length;i++){
			 a[i] = s.nextInt();
		 }
		 larger = a[0];
		 
		 for(int i=0;i<a.length;i++){
			 
			 if(a[i] > larger){
				 larger = a[i];
			 }
		 }
		 
		 System.out.printf("%d is the larger number",larger);
		  
	    }
} 
	