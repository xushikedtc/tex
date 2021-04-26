package Test02;

import java.util.Objects;

/**
 * @Author xsk
 * @Date 2021/1/3 14:28
 * @Version 1.0
 */
//房间类
public class Room {
    //房间号
    private  int no;
    //房间类型
    private String type;
    //房间状态
    //true 表示空闲   false 表示占用
    private boolean  status;
//空参
    public Room() {
    }
//有参构造
    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }
//进行封装
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
//tostring  重写
    @Override
    public String toString() {
        return "Room{" + "房间号为" + no + ", 房间类型为'" + type + '\''  + (status?"空闲":"占用") + '}';
    }
//equals方法重新
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return no == room.no && status == room.status && Objects.equals(type, room.type);
    }

}
