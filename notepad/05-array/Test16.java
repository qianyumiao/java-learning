import java.util.Scanner;
import java.util.Arrays;
public class Test16{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,22,78,91,88,66,13};
		System.out.println("数组为："+Arrays.toString(arr));
//最大值练习：
		int MaxNum = maxNum(arr);
		System.out.println("数组中最大的数为："+MaxNum);
//最小值联系：
		int MinNum = minNum(arr);
		System.out.println("数组中最小的数为："+MinNum);
/*查询指定下标的元素：
		System.out.println("请输入你想查询的下标：");
		int num1 = sc.nextInt();
		System.out.println("该下标的数字为："+get1(arr,num1));
		*/
/*查询指定元素的下标：
		System.out.println("请输入您想查询的数");
		int num2 = sc.nextInt();
		System.out.println("该数字的下标为："+get2(arr,num2));
		*/
/*添加元素：
		System.out.println("请确定您想添加的元素的下标： ");
		int num3 = sc.nextInt();
		System.out.println("请输入您想添加的元素： ");
		int num4 = sc.nextInt();
		addEle(arr,num3,num4);
		System.out.println("添加元素后的数组为："+Arrays.toString(arr));
		*/
/*删除指定下标的元素：
		System.out.println("请确定您想删除的元素的下标： ");
		int num5 = sc.nextInt();
		deEle(arr,num5);
		System.out.println("删除该下标元素后的数组为："+Arrays.toString(arr));
		*/
//删除指定元素：
		System.out.println("请输入您想删除的元素： ");
		int num6 = sc.nextInt();
		deNum(arr,num6);
		System.out.println("删除元素后的数组为："+Arrays.toString(arr));
	}
	
	
	public static int maxNum(int arr[]){
		int Max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>Max){
				Max = arr[i];
			}
		}
		return Max;
	}
	public static int minNum(int arr[]){
		int Min = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<Min){
				Min = arr[i];
			}
		}
		return Min;
	}	
	public static int get1(int arr[],int num){
		return arr[num];
	}
	public static int get2(int arr[],int num){
		int i = 0;
		for(i=0;i<arr.length;i++){
			if(arr[i]==num){
				break;
			}
		}
		return i;
	}
	public static void addEle(int arr[],int num,int num2){
		//                                 下标      数字
		for(int i=arr.length-1;i>num;i--){
			arr[i]=arr[i-1];
		}
		arr[num] = num2;
	}
	public static void deEle(int arr[],int num1){
		for(int i=num1;i<arr.length;i++){
			if(i!=arr.length-1){
				arr[i]=arr[i+1];
			}else{
				arr[i] = 0;
			}
		}
	}
	public static void deNum(int arr[],int num){
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num){
				index = i;
				break;
			}
		}
		if(index!=-1){
			for(int i=0;i<arr.length;i++){
				if(i!=arr.length-1){
					arr[i]=arr[i+1];
				}else{
					arr[i]=0;
				}
			}
		}else{
			System.out.println("数组中不存在该数！！！");
		}
		
	}
		
}