package review;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 掌握
 * 1.1 每个集合对象的创建
 * 1.2向集合添加元素
 * 1.3从集合取某个元素
 * 1.4遍历集合
 * 1.5测试HastSet的特点；无序不可重复
 */
public class HastSetTest {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<String> set=new HashSet<>();
        //添加元素
        set.add("abc");
        set.add("def");
        set.add("king");

        //set集合元素不能通过下标取了。没有下标

        //遍历集合(迭代器)
        Iterator<String> it = set.iterator();
        //Iterator<String> it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //遍历（foreach）
        for (String m:set) {
            System.out.println(m);
        }

        //HastSet的特点
        set.add("king");
        set.add("king");
        set.add("king");
        System.out.println(set.size());//(后面三个king都没有加进去)

        set.add("1");
        set.add("10");
        set.add("2");
        for (String m:set) {
            System.out.println(m);
        }
    }
}
