public class armsLimit{

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Armstrong number from..");
		int from = scan.nextInt();
		
		System.out.println("Armstrong number to..");
		int to = scan.nextInt();
		
		for(int i=from;i<to;i++){
			
			int result=0;
			int temp = i;
			while(temp>0){
				int t = temp%10;
				result = result+(t*t*t);
				temp = temp/10;
			}
			
			if(i == result){
				System.out.println(result);
			}
			
		}

	}

}