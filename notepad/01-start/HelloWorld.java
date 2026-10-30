import java.util.Scanner;
public class HelloWorld{
	public static void main(String[] args){
		System.out.println("原神牛逼");
		Scanner sc = new Scanner(System.in);
		final double PI = 3.14;
		System.out.print("请输入半径");
		int a = sc.nextInt();
		double c = PI*a*2;
		System.out.println("周长为:"+ c);
		double d = PI*a*a;
		System.out.println("面积为:"+ d);
		
	
	}
}	
