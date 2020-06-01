package main.com.muyu.builder;

/**
 * @author 赵先生
 * @date 2020/4/24 18:36
 */
public class HighBuilding extends HouseBuilder{
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    public void buildWall() {
        System.out.println("高楼砌墙");
    }

    public void roofed() {
        System.out.println("高楼盖屋顶");
    }
}
