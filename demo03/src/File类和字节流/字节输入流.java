package File类和字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 输入字节流
 */
public class 字节输入流 {
    //FileInputStream(String name)
    // 通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
    public static void main(String[] args) throws IOException {
        //构造方法
        FileInputStream inputStream=new FileInputStream("D:\\AAAA\\B\\xsk.txt");
       // int available()返回读取的剩余字节数。
        /*int m=inputStream.available();
        System.out.println(m);*/

        // int read() 从此输入流中读取一个数据字节。
        // int read(byte[] b)从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
        // int read(byte[] b, int off, int len) 从此输入流中将最多 len 个字节的数据读入一个 byte 数组中。
        //read() 读取一个字节的数据,到达文件的末尾，返回值为-1


        int value=0;
        //第一种 read 的方法
        //先判断一下存在整个目录
       /* if (new File("D:\\AAAA\\B\\xsk.txt").exists()) {
            while ((value=inputStream.read())!=-1){
                System.out.print((char) value);
            }
        }*/

        //第二种read的方法(***)ead(byte[] b) 将最多b.length个数据读取到字节数组b中。
        //自己定义，一般是1024的整数倍，也可以小。
        int count=0;
            byte []  src=new byte[1024];
      if (new File("D:\\AAAA\\B\\xsk.txt").isFile()) {
            while ((count=inputStream.read(src))!=-1){
                String s=new String(src,0,count);
                System.out.println(s);
            }
        }
      //关流
        inputStream.close();
    }
}
