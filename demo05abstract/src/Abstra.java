/**
 * @Author xsk
 * @Date 2021/3/16 20:02
 * @Version 1.0
 */
public class Abstra {
    public static void main(String[] args) {
    }
}
/*
1，抽象语法 [修饰符] abstract class 类名{
   类体
}
2，抽象类无法实例化的，无法创建对象的，所以抽象类是用来被子类继承的。
3，抽象类虽然无法实例化，但是抽象类有构造方法，这个方法是提供子类使用。
 */
abstract class Account{
    public Account(String s ){ }
}