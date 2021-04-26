package JdbcTest;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Author xsk
 * @Date 2021/3/19 21:35
 * @Version 1.0
 */
public class JDBCc3p0 {
    public static void main(String[] args) {
       //创建对象连接池
        ComboPooledDataSource com = new ComboPooledDataSource();
        try {
            //获取连接池
            Connection cn = com.getConnection();
            System.out.println(cn);
            String sql="delete from stu where sid=120";
            PreparedStatement ps = cn.prepareStatement(sql);
            int i = ps.executeUpdate();
            System.out.println(i);
            ps.close();
            com.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
