package main.com.muyu.observer;

/**
 * @author 赵先生
 * @date 2020/4/23 15:49
 */
public class ObseverB implements Observer{
    public void handleNotify(String message) {
        System.out.println("观察者B正在处理通知。。"+message);
    }
}
