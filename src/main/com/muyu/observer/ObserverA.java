package main.com.muyu.observer;

/**
 * @author 赵先生
 * @date 2020/4/23 15:47
 */
public class ObserverA implements Observer{
    public void handleNotify(String message) {
        System.out.println("观察者A正在处理通知。。"+message);
    }
}
