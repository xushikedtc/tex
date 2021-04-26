package 文件的拷贝;

import java.io.*;

/**
 * @Author xsk
 * @Date 2021/1/12 13:23
 * @Version 1.0
 */
public class CopAll {
    public static void main(String[] args) {
        //拷贝源
        File srcFile = new File("E:\\新建文件夹");
        //拷贝目标
        File destFile = new File("G:\\视频");

        //拷贝方法
        copyDir(srcFile, destFile);
    }

    /**
     *拷贝源 srcFile
     * 拷贝目标 destFile
     */
    public  static void  copyDir(File srcFile,File destFile) {
        //获取源下面的子目录
        File[] files = srcFile.listFiles();
        if (srcFile.isFile()) {
            //srcFile如果是一个文件的话，递归结束
            //是文件的时候应该拷贝
            //一边读一边写
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                //读这个文件
                in = new FileInputStream("srcFile");
                //写到这个文件中
                String path = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") + srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);
                //一边读一边写
                byte[] bytes = new byte[1024 * 1024];//一次复制1MB
                int readCount = 0;
                while ((readCount = in.read(bytes)) != -1) {
                    out.write(bytes, 0, readCount);
                }
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        for (File file : files) {
            if (file.isDirectory()) {
                //新建对应目录
                String srcDir = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath() + "\\") + srcDir.substring(3);
                File newFile = new File(destDir);
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
            }
            //递归调用
            copyDir(file, destFile);
        }
    }
}
