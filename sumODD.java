public class sumODD{

public static void main(String[] args) {

	int num,res=0;
	
	
	for(int i=0;i<=15;i++){
		res += i;
	}
	System.out.println("Sum of 15 Numbers.."+res);
	System.out.println("ODD numbers (15-45):");
	for(int i=15;i<=45;i++){
		
		if(i%2==1){
			System.out.printf("%d,",i);
		}
		
	}
	
}

}
