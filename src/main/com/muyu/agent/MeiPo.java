package main.com.muyu.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 赵先生
 * @date 2020/5/31 19:19
 * 代理模式：相亲案例:媒婆角色
 * InvocationHandler：就是代理人需要实现的接口
 */
public class MeiPo implements InvocationHandler {
    private PerSon perSon;

    //    获取被代理人的个人资料
    public Object getInstance(PerSon perSon){
        this.perSon=perSon;
//        获取到要被代理的人的信息
        Class classzz=perSon.getClass();
      //  该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例，产生了一个代理对象
       return Proxy.newProxyInstance(classzz.getClassLoader(),classzz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆+");

        perSon.findLove();
        return null;
    }
}
