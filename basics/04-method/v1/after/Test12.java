import java.util.Scanner;
public class Test12{
	public static int add(int num1,int num2){
		int sum = 0;
		sum += num1;
		sum += num2;
		return sum;
	}
	public static void main(String[] args){
		System.out.println(add(11,12));
	}
	public static void gusseNum(int GusseNum){
		int MyNum = (int)(Math.random()*6)+1;
		System.out.println(MyNum==GusseNum?"猜对咯！":"猜错咯！");
	}
}