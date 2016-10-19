public class isPrime{

	public static void main(String[] args) {
		
		int a,i;
		System.out.println("Enter a number...");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
	
		for(i=2;i<a;i++){
			if(a%i==0){
				System.out.printf("%d is not a prime",a);
				break;
			}	
		}
		if(a==i){
			System.out.printf("%d is a prime",a);
		}
		
	}
	
}