import java.util.Arrays;
public class Test19{
	public static void main(String[] args){
//Arrays工具练习：
		//toString
		int[] arr = {2,6,8,7,9,4};
		System.out.println(Arrays.toString(arr));
		//binarySearch   sort
		/*Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr,7));*/
		//copyOf
		int[] newArr = Arrays.copyOf(arr,3);
		System.out.println(Arrays.toString(newArr));
		//copyOfRange
		int[] newArr2 = Arrays.copyOfRange(arr,1,5);//[1,5)
		System.out.println(Arrays.toString(newArr2));
		//fill
		Arrays.fill(arr,666);
		System.out.println(Arrays.toString(arr));
		//arraycopy
		int[] srcArr = new int[]{1,6,1,7,6,4,8,5};
		int[] destArr = new int[]{8,5,9,6,1,7,5,6,7,2,9,8,7};
		System.arraycopy(srcArr,2,destArr,3,4);
		System.out.println(Arrays.toString(destArr));
		//equals
		int[] arr1 = {1,6,7,9};
		int[] arr2 = {1,6,7,9};
		System.out.println(Arrays.equals(arr1,arr2));
	}
}