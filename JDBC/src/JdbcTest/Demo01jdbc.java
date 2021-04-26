package JdbcTest;

import java.sql.*;

/**
 * @Author xsk
 * @Date 2021/3/21 20:33
 * @Version 1.0
 */
public class Demo01jdbc {
    public static void main(String[] args) {
        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection con=null;
        try {
             con = DriverManager.getConnection("jdbc:mysql:///demo","root","333");
             if (con!=null){
                 System.out.println("连接成功");
             }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            Statement stat = con.createStatement();
            String sql="select * from stu";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                int anInt = rs.getInt("sid");
                String sname = rs.getString("sname");
                String sex = rs.getString("sex");
                String sbir = rs.getString("sbir");

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
