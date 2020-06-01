package main.com.muyu.adapter.classadapter;

/**
 * @author 赵先生
 * @date 2020/4/24 20:54
 * 类适配器模式-手机适配器案例
 */
public class Client {
    public static void main(String[] args) {
        Phone phone =new Phone();
        phone.charging(new VoltageAdapter());
    }
}
