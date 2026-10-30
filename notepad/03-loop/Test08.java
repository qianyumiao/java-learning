 /* 输出1-100中被5整除的数,每行输出6个*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		int count = 0;
		for(int i=1;i<=100;i++){
			if(i%5==0){
				System.out.print(i + "   ");
				count++;
			}
			if(count%6==0){
				System.out.println();
			}
		}
	System.out.println("");
	System.out.println("-------------------------------------------------------");
	System.out.println("");
	System.out.println("");
	
  /*
			实现一个功能： 
	   【1】请录入10个整数，当输入的数是666的时候，退出程序。
	   【2】判断其中录入正数的个数并输出。
	   【3】判断系统的退出状态：是正常退出还是被迫退出。
	*/
		Scanner sc = new Scanner(System.in);
		boolean flag1 = true;
		int count1 = 0;
		for(int a=1;a<=10;a++){
			System.out.println("请录入第" +a+ "个数");
			int num = sc.nextInt();
			if(num>0){
				count1++;
			} 
			if(num == 666){
				flag1 = false;
				break;
			}
		}
		System.out.println("正数的个数为：" + count1);
		if(flag1){
			 System.out.println("正常退出！");
		}else{
			 System.out.println("被迫退出！");
		}
	}
	
}