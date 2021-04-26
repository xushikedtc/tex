package exeption;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 一般不建议  在main方法上使用throws，因为这个异常如果真的发生了，一定会抛给jvm。jvm只有终止
 * 异常处理机制的作用   就是增强程序的健壮性，怎么能做到，异常发生了也不影响程序的执行。所以
 * 一般main方法中的异常建议使用try catch 进行捕捉。main就不要继续上抛了
 */
public class ExeptionTest04 {
    /*public static void main(String[] args) throws FileNotFoundException {
        System.out.println("main begin");
        m1();
        System.out.println("main  over");
    }*/
    public static void main(String[] args) {
        System.out.println("main begin");
        try {
            //try  尝试
            m1();
        } catch (FileNotFoundException e) {
            //这个分支中可以使用e引用，e的引用保存的内存地址是哪个new出来异常对象的地址
            //catch   是捕捉异常之后的分支
            System.out.println(e.getMessage());
        }

        //try catch把异常抓住后，这里的代码会继续执行
        System.out.println("main  over");
    }

    private static void m1() throws FileNotFoundException {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1  over");
    }

    private static void m2() throws FileNotFoundException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2  over");
    }
    //  throws 可以抛出多个异常用，隔开
    private static void m3() throws FileNotFoundException {
        System.out.println("m3 begin");
        //一个方法体中的代码出现异常之后，如果上报，此方法结束
         new FileInputStream("D:\\第一阶段\\第一周\\day03");
        System.out.println("m3  over");
    }
}
