package main.com.muyu.factory.simplefactory;

/**
 * @author 赵先生
 * @date 2020/4/22 15:19
 */
public class IphoneSimpleFactory {

    public static Iphone produce(String model){
        if (model.equalsIgnoreCase("iphonex")){
            return new IphoneX();
        }else if(model.equalsIgnoreCase("ihone8plus")){
            return new Iphone8Plus();
        }else{
            return null;
        }

    }

}
