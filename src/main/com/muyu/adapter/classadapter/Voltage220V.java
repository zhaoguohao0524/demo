package main.com.muyu.adapter.classadapter;

/**
 * @author 赵先生
 * @date 2020/4/24 20:43
 * 适配器模式-手机适配器
 */
public class Voltage220V {
    public int output220V(){
        int src =220;
        System.out.println("电压"+src+"伏");
    return src;
    }
}
