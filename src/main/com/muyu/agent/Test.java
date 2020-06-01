package main.com.muyu.agent;

/**
 * @author 赵先生
 * @date 2020/5/31 19:18
 */
public class Test {
    public static void main(String[] args) {
        PerSon perSon =(PerSon) new MeiPo().getInstance(new ZhaoGuoHao());
        perSon.findLove();
    }
}
