package exeption;

/**
 * @Author xsk
 * @Date 2021/1/9 15:23
 * @Version 1.0
 */
//一下程序执行控制台出现了，这个信息我们称之为；异常信息，这个信息是jvm打印的
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at exeption.ExeptionTest01.main(ExeptionTest01.java:12)
public class ExeptionTest01 {
    public static void main(String[] args) {
        /*int a=10;
        int b=0;
        int c=a/b;
        System.out.println(c);*/
        //通过“异常类“， 实例化，”异常对象“
        NumberFormatException sc=new NumberFormatException("数字格式化异常");
        System.out.println(sc);

        NullPointerException sm=new NullPointerException("空指针异常发生了");
        System.out.println(sm);
    }
}
