package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;


/**
 * @Author xsk
 * @Date 2021/1/26 17:02
 * @Version 1.0
 */
public class iterTest01 {
    public static void main(String[] args) {
        Collection<Student> sm=new ArrayList();
        sm.add(new Student("张三"));
        sm.add(new Student("李四"));
        sm.add(new Student("王五"));
        Iterator<Student> iterator1 = sm.iterator();
        while (iterator1.hasNext()){
            Student next = iterator1.next();
            if (next.getName().equals("张三")){
                iterator1.remove();
            }
            System.out.println(next);
        }
    }
}
class  Student{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}