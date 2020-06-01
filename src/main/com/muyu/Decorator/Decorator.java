package main.com.muyu.Decorator;

/**
 * @author 赵先生
 * @date 2020/5/21 16:14
 */
public class Decorator {
    public static void main(String[] args) {
        /**
         * 获取加过辣椒的面
         */
        new ChiliNoodle(new Noodle()).addThings();
    }
}

/**
 * 定义一个给面加料的接口
 */
interface NoodleDecorate {

    void addThings();

}
/**
 * @时间 2020/5/21 16:21
 * @参数
 * @返回值
 * 功能解释：创建一个拉面（Noodle）类实现NoodleDecorate接口
 */
class Noodle implements NoodleDecorate {
    /**
     * 向面里加东西
     */
    @Override
    public void addThings() {
        System.out.println("加两片肉末");
        System.out.println("加一片萝卜");
        System.out.println("加三根香菜");
    }
}
/**
 * 就是在不改变原有拉面的情况下，添加自己想要的调料
 */
class ChiliNoodle implements NoodleDecorate {
    private Noodle noodle;

    public ChiliNoodle(Noodle noodle) {
        this.noodle = noodle;
    }

    @Override
    public void addThings() {
        noodle.addThings();
        System.out.println("加三勺辣椒");
    }
}
