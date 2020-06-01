package main.com.muyu.builder;

/**
 * @author 赵先生
 * @date 2020/4/24 18:38
 * 指挥者
 */
public class HouseDirector {
    HouseBuilder houseBuilder=null;
//    构造器传入 houseBuilder
    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }

    //    setter注入 houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder=houseBuilder;
    }
//    如何处理建造房子的流程，交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
