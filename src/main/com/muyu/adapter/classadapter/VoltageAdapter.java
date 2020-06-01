package main.com.muyu.adapter.classadapter;

/**
 * @author 赵先生
 * @date 2020/4/24 20:47
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    public int output5V() {
//        获取到220V的电压
        int src=output220V();
//        转成5V的电压
        int dstV=src/44;

        return dstV;
    }
}
