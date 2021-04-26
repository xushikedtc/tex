package File类和字节流;

import java.io.File;

/**
 * 用递归算法找整个D盘的文件
 */
public class FileTest02 {
    public static void main(String[] args) {
        File file=new File("D:\\");
        GetName(file);
    }
    public  static  void GetName(File sc){
        File[] files = sc.listFiles();
        //判断files不为空
        if (files != null) {
            for (File sr:files) {
                //isDirectory()测试此抽象路径名表示的文件是否是一个目录
                //判断这是是不是一个文件夹
                if (sr.isDirectory()){
                    GetName(sr);
                }else {
                    System.out.println(sr);
                }
            }
        }
    }
}
