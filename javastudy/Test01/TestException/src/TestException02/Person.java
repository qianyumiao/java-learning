package TestException02;

/**
 * @Auther: qianyu
 * @Date: 2026/10/16 - 10 - 16 - 11:38
 * @Description: TestException02
 * @version: 1.0
 */
public class Person {
    private String name;
    private String sex;
    private int age;

    public Person(){

    }
    public Person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        setSex(sex);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if ("男".equals(sex)||"女".equals(sex)){
            this.sex = sex;
        }else{
            this.sex = "男";
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("抱歉，您输入的性别有误，已默认为♂");
            }
        }
    }
}
