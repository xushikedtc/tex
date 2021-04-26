package review;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 掌握
 * 1.1 每个集合对象的创建
 * 1.2向集合添加元素
 * 1.3从集合取某个元素
 * 1.4遍历集合
 */
public class ArrayListTest {
    public static void main(String[] args) {
        //LinkedList 和ArrayList 一样
       // LinkedList<String> list=new LinkedList<>();
        //创建集合对象
        ArrayList<String> list =new ArrayList<>();
        //添加元素
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        //从集合中取某个元素
        //list 集合有下标
        String firstElt=list.get(0);
        System.out.println(firstElt);
        //遍历(下标方式)
        for (int i=0;i<list.size();i++){
            String sm=list.get(i);
            System.out.println(sm);
        }
        //遍历（迭代器方式，这是是通用的，所有collection都能用）
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //遍历（foreach）
        for (String s:list) {
            System.out.println(s);
        }
    }
}
