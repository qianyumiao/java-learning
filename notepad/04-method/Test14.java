import java.util.Scanner;
public class Test14{
	public static void main(String[] args){
//通过输入的数与随机数实现输出不同的图形：
		System.out.println("你进入了一个奇特的售卖图形的商店");
		System.out.println("你想的数（1~6）和搭档投掷骰子的数之和决定了你们得到的图形");
		System.out.println("2--菱形，2~6--正方形，7~11--平行四边形，12--空心菱形");
		Scanner sc = new Scanner(System.in);
		System.out.println("你的数为：");
		int YourNum = sc.nextInt();
		int HerNum = (int)(Math.random()*6)+1;
		System.out.println("你搭档的投掷数为："+HerNum);
		int num = add(YourNum,HerNum);
		System.out.println("你们的数为："+num);
		System.out.println("恭喜你们获得：");
		if(num==2){
			for(int j=1;j<=4;j++){
				for(int i=1;i<=(9-j);i++){
					System.out.print(" ");
				}
				for(int i=1;i<=(2*j-1);i++){
					System.out.print("*");
				}
				System.out.println();
			}
			for(int j=1;j<=3;j++){
				for(int i=1;i<=(5+j);i++){
					System.out.print(" ");
				}
				for(int i =1;i<=(7-2*j);i++){
					System.out.print("*");
				}
				System.out.println();
			}
		}else if(num<=6){
			for(int j=1;j<=9;j++){
				for(int i=1;i<=9;i++){
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}else if(num<=11){
			for(int j=1;j<=4;j++){
				for(int i=1;i<=(5-j);i++){
					System.out.print(" ");
				}
				for(int i=1;i<=5;i++){
					System.out.print("*");
				}
				System.out.println();
			}
		}else{int BeginNum = 9;int EndNum = 9;boolean flag = true;
			for(int j=1;j<=7;j++){
				for(int i=1;i<=12;i++){
					if(BeginNum==i||i==EndNum){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				if(EndNum==12){
					flag = false;
				}
				if(flag){
					BeginNum--;
					EndNum++;
				}else{
					BeginNum++;
					EndNum--;
				}
				System.out.println();
			}
		}
	}
	
	public static int add(int num1,int num2){
		return num1+num2;
	}
}