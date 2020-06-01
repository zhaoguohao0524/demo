package main.com.muyu.mianshiti;

/**
 * @author 赵先生
 * @date 2020/4/24 13:14
 * 自增变量
 */
public class zizengbianliang {
    public static void main(String[] args) {
        int i=1;
        int j=i++;
        int k=i+ ++i *i++;
        System.out.println("i:"+i);
        System.out.println("j:"+j);
        System.out.println("k:"+k);
    }
}
