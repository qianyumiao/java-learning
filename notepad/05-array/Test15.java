import java.util.Scanner;
public class Test15{
	public static void main(String[] args){
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i=1;i<=10;i++){
			System.out.println("请你录入第"+i+"名学生的成绩");
			arr[i-1] = sc.nextInt();
			sum += arr[i-1];
		}
		System.out.println("这十名学生的总成绩为："+sum);
		System.out.println("这十名学生的平均成绩为："+sum/10);
		System.out.println("你想查第几名学生的成绩？");
		int i = sc.nextInt();
		System.out.println("第"+i+"名学生的成绩为："+arr[i-1]);
	}
}