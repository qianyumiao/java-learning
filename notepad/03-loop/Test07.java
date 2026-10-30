public class Test07{
	public static void main(String[] args){
		for(int i = 0;i<=100;i++){
			if(i%6==0){
				System.out.println(i);
			}
		}
		for(int i = 0;i<=100;i++){
			if(i%6!=0){
				continue;
			}
			System.out.println(i);
		}
		int num1 = 0;int sum1 = 0;
		while(num1<=100){
			sum1 += num1;
			num1++;
		}
		System.out.println(sum1);
		
		int num2 = 1;int sum2 = 1;
		do{sum2 *= num2;
			num2 = num2 + 2;
		}while(num2<=20);
		System.out.println(sum2);
		int sum = 0;
		outer1:
		for(int num3 = 0;num3<=100;num3++){
			sum += num3;
			System.out.println(sum);
			while(sum>648){
				break outer1;
			}
			
		}
		
		
	}
	
	
}