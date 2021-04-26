package Work;

import java.util.Locale;

/**
 (1)定义如下方法public static String getPropertyGetMethodName(String property);
 (2)该方法的参数为String类型，表示用户给定的成员变量的名字，返回值类型为String类型，返回值为成员变量对应的get方法的名字
 (3)如：用户调用此方法时给定的参数为"name",该方法的返回值为"getName"
 */
public class Test01 {
    public static void main(String[] args) {
        String s="name";
        String M=getPropertyGetMethodName(s);
        System.out.println(M);
    }
    public static String getPropertyGetMethodName(String property){
        String s="get";
        String s1=property.substring(0,1).toUpperCase();
        String s2=property.substring(1);
        String S3=s+s1+s2;
        return  S3;
    }
}
