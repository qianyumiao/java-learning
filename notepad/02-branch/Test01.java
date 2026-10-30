import java.util.*;
public class Test01{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("晚饭解决方案：1.火锅   2.泡面   3.汉堡   4.自助");
	System.out.println("男生选择：");
	int boy = sc.nextInt();
	System.out.println("女生选择：");
	int girl = sc.nextInt();
	if(boy==girl){
		System.out.println("你们两真有默契");
	}else{
		System.out.println("想讨打了？");
	}
	
	//System.out.print(boy==girl?"听你的":"听你老婆的");
	}


}