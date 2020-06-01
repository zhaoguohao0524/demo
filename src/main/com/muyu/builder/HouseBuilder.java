package main.com.muyu.builder;

/**
 * @author 赵先生
 * @date 2020/4/24 18:31
 * 建造者模式-抽象的建造者
 */
public abstract class HouseBuilder {

    protected House house=new House();
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();
//    建好房子，返回
    public House buildHouse(){
        return house;
    }
}
