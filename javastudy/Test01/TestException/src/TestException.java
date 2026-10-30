import java.util.Scanner;

/**
 * @Auther: qianyu
 * @Date: 2026/10/16 - 10 - 16 - 10:11
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class TestException {
    public static void main(String[] args) {
        TestException t = new TestException();
        t.devide();
    }

    public void devide(){
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个数");
//        int num1;int num2;
//        if(sc.hasNextInt()){
//            num1 = sc.nextInt();
//        }else{
//            System.out.println("抱歉，您输入的不是整数");
//            return;
//        }
//        System.out.println("请输入第二个数");
//        if(sc.hasNextInt()){
//            num2 = sc.nextInt();
//        }else{
//            System.out.println("抱歉，您输入的不是整数或者除数为0。");
//            return;
//        }
//        System.out.println("这两个数的商值为"+num1/num2);
        try {
            System.out.println("请输入第一个数");
            int num1 = sc.nextInt();
            System.out.println("请输入第二个数");
            int num2 = sc.nextInt();
            System.out.println("这两个数的商值为"+num1/num2);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("感谢本次使用！");
        }

    }
}