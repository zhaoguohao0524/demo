package main.com.muyu.factory.simplefactory;

/**
 * @author 赵先生
 * @date 2020/4/22 15:23
 */
public class Test {
    public static void main(String[] args) {
        Iphone iphone = IphoneSimpleFactory.produce("ihone8plus");
        iphone.create();
    }
}
