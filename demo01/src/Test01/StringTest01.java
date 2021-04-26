package Test01;

/**
 * @Author xsk
 * @Date 2021/1/3 19:47
 * @Version 1.0
 */
public class StringTest01 {
    public static void main(String[] args) {
        //String 的常用方法
        //1(掌握) char charAt(int index)
        char c="中国人".charAt(1);
        System.out.println(c);//国

        //2（掌握）
        char[] chars={'我','是','中','国','人'};
        String s1=new String(chars);
        System.out.println(s1);//我是中国人
        String s2=new String(chars,2,3);//索引号为2 长度为3
        System.out.println(s2);//中国人

        //3 （掌握） boolean contains(CharSequence s)
        //判断前面字符串是否包含后面字符串
        System.out.println("hello world.java".contains(".java"));//true
        System.out.println("http:/www.baidu.com".contains("https://"));//false

        //4 (掌握) boolean endsWith(String suffix)
        //判断当前字符串是否以某个字符串结尾
        System.out.println("text.txt".endsWith(".java"));//false
        System.out.println("text.txt".endsWith(".txt"));//true

        //5 equals  判断字符串是否相等
        System.out.println("abc".equals("abc"));//true

        //6 equalsIgnoreCase
        //判断两个字符串是否相等并且忽略大小写
        System.out.println("Abc".equalsIgnoreCase("abc"));//true

        //7  getBytes
        //将字符串对象 转换成字节数组
        byte[] bytes="abcdef".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);//97,98,99,100,101,102
        }

        //8 int indexOf(String str)
        //判断某个子字符串在当前字符串第一出现处的索引
        System.out.println("qwertyu".indexOf("tyu"));//5

        //9 isEmpty
        //判断某个字符串是否为空串
        String s="";
        System.out.println(s.isEmpty());//true

        //10  length()
        //判断数组长度是length属性，  判断字符串长度是length()方法。
        System.out.println("abc".length());//3

        //11  int indexOf(String str)
        //判断某个子字符串在当前字符串最后一次出现处的索引
        System.out.println("qwertasdfzxcvqwert".lastIndexOf("qwert"));//13

        //12 String replace(CharSequence target, CharSequence replacement)
        //String的父接口就是CharSequence
        String newString="http:/www.baidu.com".replace("http","https");
        System.out.println(newString);//https:/www.baidu.com

        //13  String[] split(String regex)
        //拆分字符串
        String[] ymd="2000-10-10".split("-");//"2000-10-10"以"-"分隔符进行拆分。
        for (int i = 0; i < ymd.length ; i++) {
            System.out.println(ymd[i]);//2000   10  10
        }
        //14
        String s3="qwert";
        char[] m=s3.toCharArray();
            for (int j = 0; j <m.length ; j++) {
                System.out.println(m[j]);
            }
    }
}
