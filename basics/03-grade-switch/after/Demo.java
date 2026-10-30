public class Demo{
	static String grade(int num1){
		switch(num1/10){
			case 10:return "恭喜您，您是满分！";
			case 9:return "本次成绩为：优秀！";
			case 8:return "本次成绩为：优秀！";
			case 7:return "本次成绩为：及格！";
			case 6:return "本次成绩为：及格！";
			case 5:return "本次成绩为：不及格！";
			case 4:return "本次成绩为：不及格！";
			case 3:return "本次成绩为：不及格！";
			case 2:return "本次成绩为：不及格！";
			case 1:return "本次成绩为：不及格！";
		}
		return "<没有任何输出>";
	}
	public static void main(String[] args){
		for(int n : new int[]{1,5,9,10,59,60,66,100,101}){
			String tail = (n/10 <= 6) ? "请重新考试！" : "您通过了本次考试！";
			System.out.printf("num1=%3d -> 等级输出: %-14s | %s%n", n, grade(n), tail);
		}
	}
}
