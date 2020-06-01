package main.com.muyu.jiaqiangjiyi;

/**
 * @author 赵先生
 * @date 2020/4/22 13:14
 * 饿汉式加强记忆
 */
public class ehanshi {
    public static void main(String[] args) {
        singleton instance = singleton.getInstance();
    }
}


class singleton{
    private singleton(){
    }
    private static singleton singleton =new singleton();

    public static singleton getInstance(){
        return singleton;
    }
}
