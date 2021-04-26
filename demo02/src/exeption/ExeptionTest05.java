package exeption;

/**
 *异常对象有两个非常重要的方法
 * 获取异常简单的描述信息
 * string srm=exception.getMessage();
 *
 *   打印异常追踪的堆栈信息
 * exception.printStackTrace();
 */
public class ExeptionTest05 {
    public static void main(String[] args) {
        //这里只是为了测试getMessage和printStackTrace（）方法
        //这里只是new了异常对象，但是没有将异常对象抛出。jvm会认为只是一个普通的java对象
    NullPointerException e=new NullPointerException("空指针异常");
    //获取简单异常描述信息，实际上就是上构造方法上面传递的String参数
        String smg=e.getMessage();
        System.out.println(smg);

        //打印异常堆栈信息
        //java后台打印异常堆栈信息的时候，采用了异步线程的方式打印的。
        e.printStackTrace();

        System.out.println("Hello World");

    }
}
