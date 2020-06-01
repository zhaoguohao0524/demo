package main.com.muyu.builder;

/**
 * @author 赵先生
 * @date 2020/4/24 18:35
 */
public class CommonHouse extends HouseBuilder{
    public void buildBasic() {
        System.out.println("普通房子打地基");
    }

    public void buildWall() {
        System.out.println("普通房子砌墙");
    }

    public void roofed() {
        System.out.println("普通房子盖屋顶");
    }
}
