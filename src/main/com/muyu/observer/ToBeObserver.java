package main.com.muyu.observer;



/**
 * @author 赵先生
 * @date 2020/4/23 15:43
 * 被观察者接口
 */
public interface ToBeObserver {
    /**
     * 添加观察者
     * @param observer
     */
    public void addObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     * @param message
     */
    void notifyObserver(String message);
}
