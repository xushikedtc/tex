package Work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 //键盘录入一个字符串，统计每个字符出现的次数【使用map集合完成】
 */
public class Test05 {
    public static void main(String[] args) {

        String s = "sqawqqwrtytqwqadsadsaedwsasvdsadsadsadhghfdghfkhfbftgfzx";
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> set = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            set.put(arr[i],set.containsKey(arr[i])?set.get(arr[i])+1:1);
        }
        System.out.println(set);

        Set<Map.Entry<Character, Integer>> entries = set.entrySet();
        Iterator<Map.Entry<Character, Integer>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<Character, Integer> not = it.next();
            Character c1=not.getKey();
            Integer i1=not.getValue();
            System.out.println(c1+"有"+i1+"个");
        }
    }
}
