package Test02;

/**
 * @Author xsk
 * @Date 2021/1/3 14:28
 * @Version 1.0
 */
//酒店对象,酒店有个二维数组，二维模拟大厦所有的房间
public class Hotel {
    //模拟大厦所有房间
    private Room[][] rooms;

    public Hotel() {
        //一共有几层，每个房间的类型，每个房间编号是什么。
        //三层  每层十个房间
        rooms=new Room[3][10];
        //创建30个对象放到，放到数字中
        //二维数组的遍历
        for (int i = 0; i < rooms.length ; i++) {
            for (int j = 0; j <rooms[i].length; j++) {
                if (i==0)
                rooms[i][j]=new Room((i+1)*100+j+1,"单人间",true);
                else if(i==1)
                    rooms[i][j]=new Room((i+1)*100+j+1,"标准间",true);
                else
                    rooms[i][j]=new Room((i+1)*100+j+1,"总统套房",true);
            }
        }
    }
    //打印所有房间状态
    public void print(){
        //遍历二维数组
        for (int i = 0; i < rooms.length ; i++) {
            for (int j = 0; j <rooms[i].length; j++) {
                Room room=rooms[i][j];
                System.out.println(room);
            }
            System.out.println();
        }
    }
    //订房
    //  调用此方法 传进来一个房间编号
    public void ordea(int roomNo){
        //订房最主要的是将房间状态修改为false。room对象的status 修改为false
        //通过房间号演算出下标。获取房间对象
        Room room=rooms[roomNo/100-1][roomNo%100-1];
        // 修改为fals
        room.setStatus(false);
    }
    //退房 和订房一样 将false 在改回来
    public void exit (int roomNo){
        Room room=rooms[roomNo/100-1][roomNo%100-1];
        // 修改为true
        room.setStatus(true);
    }
}
