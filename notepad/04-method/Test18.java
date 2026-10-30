public class Test18{
	public static void main(String[] args){
//可变参数：
		method01(6,7,8);
		method01(new int[]{6,7,8,9});
		method01(66,77);
	}
	
	public static void method01(int...num){
		System.out.println("----------");
		for(int i:num){
			System.out.println(i+"\t");
		}
		System.out.println();
		System.out.println();
	}
}