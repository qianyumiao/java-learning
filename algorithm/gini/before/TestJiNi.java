package Test01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Auther: qianyu
 * @Date: 2026/11/1 - 11 - 01 - 10:34
 * @Description: Test01
 * @version: 1.0
 */
public class TestJiNi {
    static void main(String[] args) {
        //计算基尼系数
        System.out.println("一个社会的基尼系数是0到1之间的一个小数");
        System.out.println("基尼系数越小，代表社会财富分布越均匀，越大，代表社会财富分布越不均匀");
        System.out.println("现在进行测试，假定100个人，每人手上刚开始有100元，每轮每人都给出1元给另一个人，那么在很多很多轮之后，财富分配均匀吗？");
        System.out.println("如果某人在该轮没钱，那么可以不给，只接收钱");
        int people = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入测试的轮数：");
        int lunshu = sc.nextInt();
        System.out.println("人数："+"people");
        System.out.println("轮数："+lunshu);
        experiment(people,lunshu);
        System.out.println("测试结束");
    }

    public static void experiment(int people,int lunshu){
        double[] wealth = new double[people];
        Arrays.fill(wealth,100);
        boolean[] hasmoney = new boolean[people];
        for (int i = 0; i < lunshu; i++) {
            Arrays.fill(hasmoney,false);
            for (int j = 0; j < people; j++) {
                if (wealth[j] != 0){
                    hasmoney[j] = true;
                }
                if (hasmoney[j]){
                    Random num = new Random();
                    int other = num.nextInt(100);
                    if(other == j){
                        j--;
                        continue;
                    }
                    wealth[j]--;
                    wealth[other]++;
                }
            }
        }
        Arrays.sort(wealth);
        int count = 0;
        for (int i = 0; i < wealth.length; i++) {
            count++;
            System.out.print(wealth[i]+"   ");
            if (count%10==0){
                System.out.println();
            }
        }
        System.out.println("-----------------");
        double jini = CountJiNi(wealth);
        System.out.println("基尼系数为："+jini);
    }

    public static double CountJiNi(double[] wealth){
        double sum = 0;
        double money = 0;
        for (int i = 0; i < wealth.length; i++) {
            for (int j = 0; j < wealth.length; j++) {
                sum += wealth[i] - wealth[j];
            }
            money += wealth[i];
        }
        return sum/(2*wealth.length*money);
    }
}
