package Work;

/**
 定义一个方法，功能如下：给定一个字符串，返回该字符串的反转形式
 例如：字符串为abcdef，返回结果为fedcba
 */
public class Test04 {
    public static void main(String[] args) {
        String s="abcdef";
        System.out.println(vale(s));
    }
    public  static  String vale(String m){
        StringBuffer m1=new StringBuffer(m);
        m1.reverse();
        return  String.valueOf(m1);
    }
}
