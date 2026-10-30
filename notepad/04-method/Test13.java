public class Test13{
	public static void main(String[] args){
		int num1=13;
		int num2=78;
		int num3=91;
		double num4=3.14;
		double num5=6.66;
		System.out.println(add(num1,num2));
		System.out.println(add(num1,num4));
		System.out.println(add(num4,num5));
	}
	
	
	
	
	
	
	
	public static int add(int num1,int num2){
		return num1+num2;
	}
	public static double add(double num1,double num2){
		return num1+num2;
	}
	public static double add(int num1,double num2){
		return num1+num2;
	}
}