package main.com.muyu.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 赵先生
 * @date 2020/4/23 15:50
 * 被观察者动作
 */
public class Beauty implements ToBeObserver{
    List<Observer> observers;

    public Beauty(){
        observers = new ArrayList<Observer>();
    }

    /**
     * @时间 2020/4/23 15:50
     * @参数 [observer]
     * @返回值 void
     * 功能解释：添加观察者
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * @时间 2020/4/23 15:55
     * @参数 [observer]
     * @返回值 void
     * 功能解释：删除观察者
     */
    public void removeObserver(Observer observer) {

        observers.remove(observer);
    }
    /**
     * @时间 2020/4/23 15:54
     * @参数 [message]
     * @返回值 void
     * 功能解释：通知观察者
     */
    public void notifyObserver(String message) {

        for (Observer o:observers){
            o.handleNotify(message);
        }
    }
}
