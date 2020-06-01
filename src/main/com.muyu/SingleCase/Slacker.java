package main.com.muyu.SingleCase;

/**
 * @author 赵先生
 * @date 2020/4/21 22:18
 * 单例-懒汉设计模式-线程不安全方式写法
 *为什么线程不安全，当第一个用户进了创建对象的方法还没执行完的时候
 * ，第二个用户又进来创建对象，创建2个对象违背了单例模式的本意
 * 选择第二种解法,直接抛弃
 */
public class Slacker {
    public static void main(String[] args) {
        SingletonSlacker instance = SingletonSlacker.getInstance();
        SingletonSlacker instance2=SingletonSlacker.getInstance();
        System.out.println(instance==instance2);
    }
}
//单例;懒汉式
class SingletonSlacker{
//    构造器私有化
    private SingletonSlacker(){}
    private static SingletonSlacker singletonSlacker;
    //synchronized:防止
    public static synchronized SingletonSlacker getInstance(){
//        如果为空再new对象给调用用方法
        if (singletonSlacker == null){
            System.out.println("创建新的对象");
            singletonSlacker=new SingletonSlacker();
        }
        return singletonSlacker;
    }

}