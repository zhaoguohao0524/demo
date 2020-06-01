package main.com.muyu.jiaqiangjiyi;

/**
 * @author 赵先生
 * @date 2020/4/22 13:20
 * 单例：懒汉式-静态类部类
 */
public class jingtaileibulei {
    public static void main(String[] args) {
        SingleTon instance = SingleTon.getInstance();
    }
}
//静态类部类
class SingleTon{
    //构造器私有化
    private SingleTon(){

    }
    private static volatile SingleTon singleTon=new SingleTon();

    private static class Singletongetinstance{
        private static final SingleTon singleton=new SingleTon();
    }

    public static SingleTon getInstance(){
        return Singletongetinstance.singleton;
    }
}
