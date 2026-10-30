public class Test11{
	public static void main(String[] args){
//二重循环帮忙解二元方程：
		System.out.println("求解：x+y=30，x<=100,y<=100(正整数解)");
		for(int x=1;x<=100;x++){
				for(int y=1;y<=100;y++){
					if(x+y==30){
						System.out.println("x="+x+",y="+y);
					}
				}
		}
		System.out.println();
		System.out.println("-----------------------------------------------");
//三重循环帮忙解三元方程：
		System.out.println("经典问题，百钱买百鸡：公鸡5文钱一只，母鸡3文钱一只，小鸡3只一文钱，用100文钱买一百只鸡,其中公鸡，母鸡，小鸡都必须要有，问公鸡，母鸡，小鸡要买多少只刚好凑足100文钱。");
		for(int a=1;a<=20;a++){
			for(int b=1;b<=33;b++){
				for(int c=3;c<=300;c=c+3){
					if((a+b+c)==100&&(5*a)+(3*b)+(c/3)==100){
						System.out.println("公鸡买了"+a+"只，母鸡买了"+b+"只，小鸡买了"+c+"只");
					}
				}
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------------");
//简化：
		for(int a=1;a<=20;a++){
			for(int b=1;b<=33;b++){
					if((5*a+3*b+((100-a-b)/3))==100&&((100-a-b)%3)==0){
						System.out.println("公鸡买了"+a+"只，母鸡买了"+b+"只，小鸡买了"+(100-a-b)+"只");
					}
			}
		}
	}
}	