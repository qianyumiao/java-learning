package TestException02;

/**
 * @Auther: qianyu
 * @Date: 2026/10/16 - 10 - 16 - 11:38
 * @Description: TestException02
 * @version: 1.0
 */
public class Student extends Person {
    public Student(){
    }
    public Student(String name,int age,String sex){
        super(name,age,sex);
    }
    public void study(){
        System.out.println("我是学生，我会学习。。。");
    }
}
