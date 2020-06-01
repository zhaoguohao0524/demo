package main.com.muyu.observer;

/**
 * @author 赵先生
 * @date 2020/4/23 15:55
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
//        创建被观察者
        ToBeObserver toBeObserver=new Beauty();
//        创建观察者A
        Observer observerA=new ObserverA();
//        创建观察者B
        Observer observerB=new ObseverB();
//        添加观察者
        toBeObserver.addObserver(observerA);
        toBeObserver.addObserver(observerB);
//        发通知
        toBeObserver.notifyObserver("刘德华摔倒了");
    }
}
