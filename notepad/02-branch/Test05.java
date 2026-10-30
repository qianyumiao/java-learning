import java.util.*;
public class Test05{
	public static void main(String[] args){
		int num1 = (int)(Math.random()*100 + 1);
		Scanner sc = new Scanner(System.in);
		System.out.println("您本次的成绩为："+num1);
		int num2 = num1/10;
		switch(num1/10){
			case 10:System.out.println("恭喜您，您是满分！");break;
			case 9:System.out.println("本次成绩为：优秀！");break;
			case 8:System.out.println("本次成绩为：优秀！");break;
			case 7:System.out.println("本次成绩为：及格！");break;
			case 6:System.out.println("本次成绩为：及格！");break;
			case 5:System.out.println("本次成绩为：不及格！");break;
			case 4:System.out.println("本次成绩为：不及格！");break;
			case 3:System.out.println("本次成绩为：不及格！");break;
			case 2:System.out.println("本次成绩为：不及格！");break;
			case 1:System.out.println("本次成绩为：不及格！");break;
		}
		if(num2<=6){
				System.out.println("请重新考试！");
			}else{
				System.out.println("您通过了本次考试！");
			}
		
		
	}
	
}