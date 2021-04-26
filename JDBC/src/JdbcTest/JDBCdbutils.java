package JdbcTest;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author xsk
 * @Date 2021/3/20 15:26
 * @Version 1.0
 */
public class JDBCdbutils {
    QueryRunner qu=null;
    @Before
    public void start(){
         qu = new QueryRunner(new ComboPooledDataSource());
    }
    @Test
    public  void add(){
        String sql="insert into stu values (106,'马六','男','2011-1-4')";
        try {
            int  n = qu.update(sql);
            System.out.println(n);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Test
    public void update(){
        String sql="update  stu set sid=110 where sid=?";
        try {
            int n= qu.update(sql,106);
            System.out.println(n);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Test
    public void delete(){
        String sql="delete from stu where sid=110 ";
        int n = 0;
        try {
            n = qu.update(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(n);
    }
    @Test
    public void setQu() throws SQLException {
        String sql="select * from stu where sid=111";
        Student st = qu.query(sql, new BeanHandler<>(Student.class));
        System.out.println(st);
    }
    @Test
    public void setQu1(){
        String sql="select * from stu where sex=?";
        try {
            List<Student> stu = qu.query(sql, new BeanListHandler<>(Student.class), "男");
            System.out.println(stu);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    @Test
    public  void setQu2(){
        String sql="select count(*) from stu";
        Number number = null;
        try {
            number = qu.query(sql, new ScalarHandler<Number>());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(number);
    }
}
