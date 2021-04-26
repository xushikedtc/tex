package Test01;

/**
 * @Author xsk
 * @Date 2021/1/1 20:39
 * @Version 1.0
 */
public class demo02 {
    public static void main(String[] args) {
        add  m1=new add();

        m1.mysun(new Compaute() {
                    @Override
            public  int sum(int a, int b) {
                return a+b;
            }
        },23,24);
    }
}
interface Compaute{
    int sum(int a,int b);
}
class  add{
    public  void mysun(Compaute c,int m,int s){
        int vealy=(c.sum(m,s));
        System.out.println(vealy);
    }
}