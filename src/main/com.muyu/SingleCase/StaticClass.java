package main.com.muyu.SingleCase;

/**
 * @author 赵先生
 * @date 2020/4/21 23:48
 * //静态内部类完成的单例模式-推荐使用
 *  这种写法的好处：
 *  类装载解释：第一次访问某个类会进行类的装载操作
 *  本类在类装载的时候，静态类部类不会执行类装载操作，从而懒加载创建对象的方式是可以使用的
 *  当调用getInstance，就进到类部类里面去，开始类装载，JVM底层在装载类的时候不会发生安全问题，
 *  所以也解决了创建对象的安全问题
 *
 */
public class StaticClass {
    public static void main(String[] args) {
        SingletonSlackerTwo instance = SingletonSlackerTwo.getInstance();
        SingletonSlackerTwo instance1=SingletonSlackerTwo.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        System.out.println(instance==instance1);
    }
}


class SingletonSlackerTwo{
    private static volatile SingletonSlackerTwo SingletonSlackerTwo;
    //构造器私有化
    private SingletonSlackerTwo(){}
    //写一个静态内部类，该类中有个静态属性singleton
    private static class SingletonInstance{
        private static final SingletonSlackerTwo Instance=new SingletonSlackerTwo();
    }
    //提供一个静态的共有方法，直接返回SingletonInstance.Instance
    public static  SingletonSlackerTwo getInstance() {
        return SingletonInstance.Instance;
    }
}