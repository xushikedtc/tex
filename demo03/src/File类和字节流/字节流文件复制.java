package File类和字节流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author xsk
 * @Date 2021/1/11 22:06
 * @Version 1.0
 */
public class 字节流文件复制 {
    public static void main(String[] args) throws IOException {
        //将 D:\AAAA\B\xsk.txt 复制到D:\AAAA\B\123.txt
        FileInputStream in=new FileInputStream("D:\\AAAA\\B\\xsk.txt");
        FileOutputStream out=new FileOutputStream("D:\\AAAA\\B\\123.txt");
        int count=0;
        byte []sm=new byte[1024];//定义一个数组
        while ((count=in.read(sm))!=-1){
            out.write(sm,0,count);
        }
        //关流
        in.close();
        out.close();
    }
}
