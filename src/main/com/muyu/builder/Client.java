package main.com.muyu.builder;

/**
 * @author 赵先生
 * @date 2020/4/24 18:38
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector=new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();

    }
}
