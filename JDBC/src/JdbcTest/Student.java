package JdbcTest;

/**
 * @Author xsk
 * @Date 2021/3/21 21:13
 * @Version 1.0
 */
public class Student {
    private int  sid;
    private String sname;
    private String sex;
    private String sbir;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSbir() {
        return sbir;
    }

    public void setSbir(String sbir) {
        this.sbir = sbir;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sex='" + sex + '\'' +
                ", sbir='" + sbir + '\'' +
                '}';

    }
}
