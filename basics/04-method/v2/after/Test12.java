import java.util.Scanner;

public class Test12 {
	public static int add(int num1, int num2) {
		int sum = 0;
		sum += num1;
		sum += num2;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(add(11, 12));

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你所猜的数字（1~6）");
		int yourGusseNum = sc.nextInt();
		gusseNum(yourGusseNum);

		System.out.println("接下来尝试两个数互换：");
		int[] nums = { 78, 91 };
		System.out.println(nums[0] + "----------" + nums[1]);
		changeNum(nums);          // 传数组：方法内改的是同一个数组对象
		System.out.println(nums[0] + "----------" + nums[1]);

		sc.close();
	}

	public static void gusseNum(int gusseNum) {
		int myNum = (int) (Math.random() * 6) + 1;
		System.out.println(myNum == gusseNum ? "猜对咯！" : "猜错咯！");
	}

	// 交换数组里的两个元素
	public static void changeNum(int[] arr) {
		int i = arr[0];
		arr[0] = arr[1];
		arr[1] = i;
	}
}
