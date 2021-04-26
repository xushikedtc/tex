package JdbcTest;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Author xsk
 * @Date 2021/3/20 14:45
 * @Version 1.0
 */
public class JDBCdbcp {
    public static void main(String[] args) {
        Properties pr = new Properties();
        try {
            pr.load(JDBCdbcp.class.getClassLoader().getResourceAsStream("dbcp.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Connection  con=null;
        try {
            BasicDataSource da = BasicDataSourceFactory.createDataSource(pr);
               con=da.getConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }
        String sql="insert into stu values(?,?,?,?)";
        try {
            PreparedStatement  p = con.prepareStatement(sql);
                p.setInt(1,105);
                p.setString(2,"学博");
                p.setString(3,"男");
                p.setString(4,"2000-1-5");
            int i = p.executeUpdate();
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
