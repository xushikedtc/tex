package exeption;

/**
 */
public class ExeptionTest03 {
    //第一种处理方式，在方法的声明位置继续使用throws，来完成异常的继续上抛，抛给调用者
    /*public static void main(String[] args) throws ClassNotFoundException {
       doSome();
    }*/

    //第二种方式；try catch进行捕捉
    public static void main(String[] args)  {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public  static void doSome() throws ClassNotFoundException  {
        System.out.println("dosome!!");
    }
}
