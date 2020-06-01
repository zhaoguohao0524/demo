package main.com.muyu.jiaqiangjiyi;

/**
 * @author 赵先生
 * @date 2020/4/22 13:28
 */
public class meiju {
    public static void main(String[] args) {
        a instance = a.Instance;
       a  instance1=a.Instance;
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

enum a{
    Instance;
}