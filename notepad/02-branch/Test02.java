import java.util.Scanner;

public class Test02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("支线任务：搬桌子");
        System.out.println("是否继续？    1.是    2.不    （填写数字）");
        String a = sc.next();

        if ("1".equals(a)) {
            System.out.println("请输入你的年龄：");
            int b = sc.nextInt();

            if (b >= 18) {
                System.out.println("好的，感谢您的加入！");
            } else if (b >= 14) {
                System.out.println("请输入您的性别： 1.男性    2.女性  （填写数字）");
                String c = sc.next();

                if ("1".equals(c)) {
                    System.out.println("好的，感谢您的加入！");
                } else {
                    System.out.println("抱歉，这可能会对您造成伤害，所以您不能来。");
                }
            } else {
                System.out.println("抱歉，您不符合要求");
            }
        } else {
            System.out.println("好的，请继续主线。");
        }

        sc.close();
    }
}
