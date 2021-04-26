package File类和字节流;

import java.io.File;
import java.io.IOException;

/**
 * File类的语法
 */
public class FileClassTest {
    public static void main(String[] args) throws IOException {
        //构造方法 File（），把字符串的路径，封装成一个File对象
        File file=new File("D:\\AAAA\\B");
        //1.boolean createNewFile()
        // 当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件
       // file.createNewFile();

        //2. boolean delete()
        //   删除此抽象路径名表示的文件或目录。
       // file.delete();

        //3boolean mkdir()  创建此抽象路径名指定的目录。
        // boolean mkdirs()  创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
            file.mkdirs();

        //4.boolean exists()
        //   测试此抽象路径名表示的文件或目录是否存在。
            boolean s=file.exists();
            System.out.println(s);

         //5.String  getName()
        //   返回由此抽象路径名表示的文件或目录的名称。
        /*String str=file.getName();
        System.out.println(str);*/   //B

        //6. File getAbsoluteFile()返回此抽象路径名的绝对路径名形式。
        // String getAbsolutePath()返回此抽象路径名的绝对路径名字符串。
        /*String  str= file.getAbsolutePath();
        System.out.println(str);*/   // D:\AAAA\B

        //7.String[] list()返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
        // File[] listFiles() 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
        File  m1=new File("d:\\");
        File []  fle=m1.listFiles();
        //为了防止空指针，会要求判断fle的值是否为null
        if (fle!= null) {
            //D盘下目录
            for (File file1:fle) {
                System.out.println(file1);
            }
        }
        //(***)8.isDirectory() 判断是否为目录  如果目录不存在，返回值是false。
        // isFile()文件 ,如果文件不存在，返回值是false。
    }
}
