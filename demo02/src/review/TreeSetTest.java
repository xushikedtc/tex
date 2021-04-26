package review;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 掌握
 * 1.1 每个集合对象的创建
 * 1.2向集合添加元素
 * 1.3从集合取某个元素
 * 1.4遍历集合
 * 1.5测试TreeSet集合中的元素是可排序的
 * 1.6测试TreeSet集合中存储的元素是自定义的。
 * 1.7测试Comparable 接口的 方式
 * 1.8测试Comparator 接口的方式
 */
public class TreeSetTest {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Integer> ts=new TreeSet<>();
        //添加元素
        ts.add(1);
        ts.add(100);
        ts.add(10);
        ts.add(0);

        //遍历集合(迭代器)
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //遍历（foreach）
        for (Integer m:ts) {
            System.out.println(m);
        }
        //TreeSet集合中存储的元素是自定义的。
        System.out.println("测试Comparable");
        TreeSet<A> aTreeSet=new TreeSet<>();
        aTreeSet.add(new A(100));
        aTreeSet.add(new A(200));
        aTreeSet.add(new A(500));
        aTreeSet.add(new A(300));
        aTreeSet.add(new A(700));
        //遍历
        for (A a:aTreeSet) {
            System.out.println(a);
        }
        System.out.println("测试Comparator");
        TreeSet<B> bTreeSet=new TreeSet<>(new bComparator());
        bTreeSet.add(new B(700));
        bTreeSet.add(new B(400));
        bTreeSet.add(new B(200));
        bTreeSet.add(new B(300));

        for (B b:bTreeSet) {
            System.out.println(b);
        }
    }
}
//第一种方式 实现Comparable接口
class A implements Comparable<A>{
    int i;

    public A(int i) {
        this.i = i;
    }

    public A() {
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                '}';
    }

    @Override
    public int compareTo(A o) {
        return this.i-o.i;
    }
}
//
class  B{
    int i;

    public B() {
    }

    public B(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "B{" +
                "i=" + i +
                '}';
    }
}
//单独写一个比较器
class  bComparator implements Comparator<B>{

    @Override
    public int compare(B o1, B o2) {
        return o1.i-o2.i;
    }
}