package main.com.muyu.SingleCase;

/**
 * @author 赵先生
 * @date 2020/4/22 0:43
 * 枚举方式实现单例模式
 *推荐使用
 */
public class EnumSingleton {
    public static void main(String[] args) {
        singletonforenum instance = singletonforenum.INSTANCE;
        singletonforenum instance1 = singletonforenum.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        instance.hello();
    }
}
enum singletonforenum{
    INSTANCE;//属性
    public void hello(){
        System.out.println("hello");
    }
        }