package Test02;

/**
 * @Author xsk
 * @Date 2021/1/3 14:55
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建酒店对象
        Hotel hotel=new Hotel();
        //打印房间状态
        hotel.print();
        System.out.println("===================");
        hotel.ordea(102);
        hotel.ordea(103);
        hotel.exit(102);
        hotel.print();
    }
}
