package Work;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author xsk
 * @Date 2021/1/10 20:16
 * @Version 1.0
 */
public class playPoker {
    public static void main(String[] args) {
        //准备扑克牌
        //1,准备花色和数字
        String[] color={"♥","♦","♠","♣"};
        String[] num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        ArrayList<String> poker=new ArrayList<>();
        //制作扑克牌
        for (int j=0;j<color.length;j++) {
            for (int i = 0; i < num.length; i++) {
                poker.add(color[j]+num[i]);
            }
        }
        poker.add("大王");
        poker.add("小王");
        //洗牌
        Collections.shuffle(poker);

        //发牌
        ArrayList<String> count=new ArrayList<>();
        ArrayList<String> play1=new ArrayList<>();
        ArrayList<String> play2=new ArrayList<>();
        ArrayList<String> play3=new ArrayList<>();
        for (int i = 0; i <poker.size(); i++) {
            //留底牌
            if (i>50) {
                count.add(poker.get(i));
             //分给玩家
            }else {
                if (i % 3 == 0)
                    play1.add(poker.get(i));
                if (i % 3 == 1)
                    play2.add(poker.get(i));
                if (i % 3 == 2)
                    play3.add(poker.get(i));
            }
        }
        System.out.println("成三的底牌为"+play1);
        System.out.println("吴三的底牌为"+play2);
        System.out.println("高三的底牌为"+play3);
        System.out.println("底牌为"+count);
    }
}
