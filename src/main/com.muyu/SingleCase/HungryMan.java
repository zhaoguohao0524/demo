package main.com.muyu.SingleCase;

/**
 * @author 赵先生
 * @date 2020/4/21 22:21
 * 单例：一个类只有一个被new出来的对象
 * 单例设计模式-饿汉式写法
 * 饿汉式优点：写类装载的时候就完成了实例化，避免了线程同步的问题
 * 缺点在类装载的时候完成实例化，没有达到懒加载的效果，如果一直没有使用这个实例，将会造成资源浪费
  * 在频繁使用的类中可以采用这种设计模式，比如权限的shiro-realm
 * 每次访问后台都需要受权，都需要进shiro-realm中
 */
public class HungryMan {


    public static void main(String[] args) {
        SingletonHungryMan singleton1 = SingletonHungryMan.getInstance();
        SingletonHungryMan singleton = SingletonHungryMan.getInstance();
        System.out.println(singleton==singleton1);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }



}

//饿汉式（静态变量）
class SingletonHungryMan{
    //1。构造器私有化，外部不能new
    private SingletonHungryMan(){

    }
    //2本类内部创建对象实例
    private static SingletonHungryMan singleton=new SingletonHungryMan();
    //创建一个get方法，返回一个实例
    public static SingletonHungryMan getInstance(){
        return singleton;
    }
}
