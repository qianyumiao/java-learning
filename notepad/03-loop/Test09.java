public class Test09{
	public static void main(String[] args){
//多次循环实现乘法表：
		for(int num1=1;num1<=9;num1++){
			System.out.print(num1+"*9="+num1*9+ "\t");
		}
		System.out.println();
		for(int num2=1;num2<=8;num2++){
			System.out.print(num2+"*9="+num2*8+ "\t");
		}
		System.out.println();
		for(int num3=1;num3<=7;num3++){
			System.out.print(num3+"*9="+num3*7+ "\t");
		}
		System.out.println();
		for(int num4=1;num4<=6;num4++){
			System.out.print(num4+"*9="+num4*6+ "\t");
		}
		
//二重循环实现乘法表：
		for(int j =1;j<=9;j++){
			for(int i=1;i<=j;i++){
				System.out.print(j+"*"+i+"="+i*j+ "\t");
			}
			System.out.println();
		}
		
		
	}
}	

	