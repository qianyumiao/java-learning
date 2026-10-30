public class Demo {
	// 情况A：改数组的“内容”
	static void changeContent(int[] arr) {
		arr[0] = 999;
	}

	// 情况B：改参数本身，让它指向新数组
	static void changeReference(int[] arr) {
		arr = new int[] { 777, 888 };
		arr[0] = 555;
	}

	// 情况C：基本类型，改的是副本
	static void changePrimitive(int x) {
		x = 100;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2 };
		System.out.println("初始            : " + a[0] + "," + a[1]);

		changeContent(a);
		System.out.println("改内容后        : " + a[0] + "," + a[1]);

		changeReference(a);
		System.out.println("改引用后        : " + a[0] + "," + a[1]);

		int x = 7;
		changePrimitive(x);
		System.out.println("基本类型后      : " + x);
	}
}
