package Test01;

//  1、设计：
//	* 动物类：姓名，年龄，吃饭，睡觉。
//	* 猫类（捉老鼠）和狗类（看家）
//	* 动物培训接口：跳高
//	* 会跳高的猫
public class demo01 {
    public static void main(String[] args) {
        Cat m=new Cat("小黄",3);
        System.out.println(m.getName());
        m.eat();
        m.Sleep();
        m.run();
    }
}
class Animal{
    private String name="花花";
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void eat(){
        System.out.println("吃饭");
    }
    public  void Sleep(){
        System.out.println("睡觉");
    }
}
interface Syb{
    public void high();
}
class Cat extends Animal implements Syb{

    @Override
    public void high() {
        System.out.println("猫在跳高");
    }

    @Override
    public void eat() {
        System.out.println("猫在吃鱼");
    }

    @Override
    public void Sleep() {
        System.out.println("猫在睡觉");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }
    public void run(){
        System.out.println("捉老鼠");
    }
}