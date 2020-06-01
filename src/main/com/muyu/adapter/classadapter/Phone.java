package main.com.muyu.adapter.classadapter;

/**
 * @author 赵先生
 * @date 2020/4/24 20:51
 */
public class Phone {
//    充电
    public void charging(Voltage5V voltage5V){
        if (voltage5V.output5V()==5){
            System.out.println("电压5V,可以充电");
        }else if(voltage5V.output5V()>5){
            System.out.println("电压大于5伏不能充电");
        }
    }
}
