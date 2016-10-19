public class primeToLimit{

	public static void main(String[] args) {
		
		int a,b,i,j;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Prime numbers FROM");
		b = s.nextInt();

		System.out.println("Prime numbers TO");
		a = s.nextInt();
	
		for(i=b;i<a;i++){
			
			for(j=2;j<i;j++){
				if(i%j==0){
					break;
				}	
			}
			if(i==j){
				System.out.println(i);
			}
			
		}
		
		
		
	}
	
}