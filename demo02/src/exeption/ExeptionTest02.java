package exeption;

/**
 * 以下代码报错的原因是什么
 * 因为dosome（）方法位置上使用了throws ClassNotFoundException
 * 而throws ClassNotFoundException是编译时异常必须编写代码的时候处理，没有处理会报错
 */
public class ExeptionTest02 {
    public static void main(String[] args) {
            //main调用dosome方法
            //因为doSome() 方法在声明位置上有；throws ClassNotFoundException
            //我们调用dosome()方法的时候必须对这种异常进行预先处理
            //如果不处理编译器会报错
        //编译器报错信息Unhandled exception: java.lang.ClassNotFoundException
        //doSome();
    }
    /**
     * doSome() 方法在声明上使用了；throws ClassNotFoundException
     * 这个代码表示doSome()方法在执行过程中 ，可能会出现ClassNotFoundException异常
     * 叫做类没找到异常，这个异常的父类是 Exception，所以ClassNotFoundException属于编译异常
     */
    public  static void doSome() throws ClassNotFoundException  {
        System.out.println("dosome!!");
    }
}
