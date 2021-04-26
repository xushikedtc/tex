package File类和字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 1.构造方法：
 ① FileOutputStream(File file) /FileOutputStream(String file)
 ②  FileOutputStream(File file,boolean append) /FileOutputStream(String file,boolean append)
 创建文件字节输出流的对象，如果有第二个参数，并且参数值为true，表示可以从文件末尾追加。
 注意：
 1》 当文件不存在，也不能创建时，报FileNotFoundException文件找不到异常
 2》如果文件可以创建，会创建一个空文件。不会报异常。
 */
public class 字节输出流 {
    public static void main(String[] args) throws IOException {
        FileOutputStream FileOutputStream =new FileOutputStream("D:\\AAAA\\B\\123.txt");

        //2.常用方法：
        //      ① write(int b) 将指定字节写入到文件输出流中。
        //      ② write(byte[] b) 将一个字节数组的内容写到文件输出流中
     // (***)③ write(byte[] b, int off, int len) 将一个字节数组从off索引对应的位置开始的len个字节写到文件输出流中。
       //方法一 FileOutputStream.write(97);//输出a

        //方法二  不建议用
        /*byte []  bt=new byte[10];
        FileOutputStream.write(bt);*/

        //方法三   重点
        byte [] bt={97,98,99,0,0,0};
        FileOutputStream.write(bt,0,2);//三个参数  数组 ，起始位置，结束位置
        //输出a  b  c
        //关流
        FileOutputStream.close();
    }
}
