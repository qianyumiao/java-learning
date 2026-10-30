public class Test20{
	public static void main(String[] args){
		//1
		int[][] doubleArr1 = new int[3][];
		doubleArr1[0] = new int[]{1,6,7,8};
		doubleArr1[1] = new int[]{5,7};
		doubleArr1[2] = new int[]{8,9};
		for(int[] arr:doubleArr1){
			for(int num:arr){
				System.out.print(num+"\t");
			}System.out.println();
		}
		//2
		int[][] doubleArr2 = {{1,3,6},{6,4,8,7},{4,6}};
		for(int i=0;i<doubleArr2.length;i++){
			for(int j=0;j<doubleArr2[i].length;j++){
				System.out.print(doubleArr2[i][j]+"\t");
			}
			System.out.println();
		}
	}
}