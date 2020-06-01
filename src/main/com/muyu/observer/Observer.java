package main.com.muyu.observer;

/**
 * @author 赵先生
 * @date 2020/4/23 15:40
 * 观察者接口
 */
public interface Observer {
    /**
     * 在接收到通知后做出相应的处理
     * @param message
     */
    public void handleNotify(String message);
}
