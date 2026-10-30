public class Test10{
	public static void main(String[] args){
//目标：打印长方形：
		for(int j=1;j<=4;j++){
			for(int i=1;i<=5;i++){
				System.out.print(" ");
			}
			for(int i=1;i<=9;i++){
				System.out.print("*");
			}
			System.out.println();
		}	
		System.out.println();
		System.out.println("----------------------------------");
//目标：打印平行四边形：
		for(int j=1;j<=4;j++){
			for(int i=1;i<=(9-j);i++){
				System.out.print(" ");
			}
			for(int i=1;i<=9;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("----------------------------------");
//目标：打印菱形：（方法1）
		//int b1 = 10;int e1 = 10;boolean flag1 = true;
		for(int j=1;j<=4;j++){
			for(int i=1;i<=(9-j);i++){
				System.out.print(" ");
			}
			for(int i=1;i<=(j*2-1);i++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int j=1;j<=3;j++){
			for(int i=1;i<=(j+5);i++){
				System.out.print(" ");
			}
			for(int i=1;i<=(7-2*j);i++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-----------------------------------");
//空心菱形1：
		for(int j=1;j<=4;j++){
			for(int i=1;i<=(9-j);i++){
				System.out.print(" ");
			}
			for(int i=1;i<=(j*2-1);i++){
				if(i==1||i==(j*2-1)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int j=1;j<=3;j++){
			for(int i=1;i<=(j+5);i++){
				System.out.print(" ");
			}
			for(int i=1;i<=(7-2*j);i++){
				if(i==1||i==(7-2*j)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-----------------------------------------");
//打印菱形（方法2）：
		int size = 7;int BeginNum = size/2+1;int EndNum = size/2+1;boolean flag2 = true;
		for(int j=1;j<=size;j++){
			for(int i=1;i<=size;i++){
				if(i>=BeginNum&&i<=EndNum){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			if(EndNum==size){
				flag2 = false;
			}
			if(flag2){
				BeginNum--;
				EndNum++;
			}else{
				BeginNum++;
				EndNum--;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------------------------------------------");
//打印空心菱形（方法2）：
				int size2 = 7;int BeginNum2 = size2/2+1;int EndNum2 = size/2+1;boolean flag3 = true;
		for(int j=1;j<=size2;j++){
			for(int i=1;i<=size2;i++){
				if(i==BeginNum2||i==EndNum2){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			if(EndNum2==size){
				flag3 = false;
			}
			if(flag3){
				BeginNum2--;
				EndNum2++;
			}else{
				BeginNum2++;
				EndNum2--;
			}
			System.out.println();
		}
	}
	
}