package review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 掌握
 * 1.1 每个集合对象的创建
 * 1.2向集合添加元素
 * 1.3从集合取某个元素
 * 1.4遍历集合
 */
public class HashMapTest {
    public static void main(String[] args) {
        //集合对象的创建
        Map<Integer,String> map =new HashMap<>();
        //添加元素
        map.put(1,"zhangsan");
        map.put(9,"lisi");
        map.put(10,"wangwu");
        map.put(2,"king");
        map.put(2,"simth");//key重复value会覆盖
        //获取元素个数
        System.out.println(map.size());
        //取出key为2的元素
        System.out.println(map.get(2));//simth

        //遍历Map集合很重要，几种方式都要会
        //第一种方式；获取所有的key，遍历key的时候 通过key的值获取value
        Set<Integer> integers = map.keySet();
        //迭代器
        System.out.println("第一种方式迭代器");
        Iterator<Integer> it = integers.iterator();
        while (it.hasNext()){
            Integer m = it.next();
            System.out.println(m+"  "+map.get(m));
        }
        //foreach
        System.out.println("第一种方式foreach");
        for (Integer key:integers) {
            System.out.println(key+"  "+map.get(key));
        }


        //第二种方式；是将Map集合转换成Set集合,Set集合中每个元素是Node
        //这个Node节点有key和value
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        //迭代器
        System.out.println("第二种方式迭代器");
        Iterator<Map.Entry<Integer, String>> it1 = entries.iterator();
        while (it1.hasNext()){
            /*System.out.println(it1.next());*/
            Map.Entry<Integer, String> next = it1.next();
            Integer key = next.getKey();
            String value = next.getValue();
            System.out.println(key+" "+value);
        }
        //foreach
        System.out.println("第二种方式foreach");
        for (Map.Entry<Integer, String> m1:entries) {
            System.out.println(m1);
           /* Integer key = m1.getKey();
            String value = m1.getValue();
            System.out.println(key+"  "+value);*/
        }
    }
}
