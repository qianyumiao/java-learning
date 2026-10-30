import java.util.*;

public class Test05Fixed {
    public static void main(String[] args) {
        // 1) random()，不是 randon()；2) +1 让范围落在 1~100
        int num1 = (int) (Math.random() * 100 + 1);
        Scanner sc = new Scanner(System.in);          // 若不需要输入，可删除本行
        System.out.println("您本次的成绩为：" + num1);

        switch (num1 / 10) {
            case 10:
                System.out.println("恭喜您，您是满分！");
                break;
            case 9:
            case 8:
                System.out.println("本次成绩为：优秀！");
                break;
            case 7:
            case 6:
                System.out.println("本次成绩为：及格！");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:                                    // 补上 0~9 分的情况
                System.out.println("本次成绩为：不及格！");
                break;
            default:
                System.out.println("成绩非法！");
        }

        // 及格线是 60 分，所以判断应放在 switch 之外，且用 < 6
        if (num1 / 10 < 6) {
            System.out.println("请重新考试！");
        } else {
            System.out.println("您通过了本次考试！");
        }

        sc.close();
    }
}
