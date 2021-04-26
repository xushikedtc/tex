package Work;

/**
 定义一个方法，功能如下：给定一个数组，转换成一个字符串
 例如：数组为int[] arr = {1, 2, 3}，字符串为[1, 2, 3]

 */
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        StringBuffer s=new StringBuffer("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
            s=s.append(arr[i]).append("]");
            }else
                s=s.append(arr[i]).append(",");
        }
        System.out.println(s);
    }
}
