package main.com.muyu.mianshiti;

/**
 * @author 赵先生
 * @date 2020/4/24 15:05
 * 考点:方法传参与（基本类型、引用类型、包装类型）的使用
 *
 */
public class fangfachuancan {
    public static void main(String[] args) {
        int i=1;
        String h="hello";
        Integer j=200;
        int [] num={1,2,3,4,5};
        Mydata m=new Mydata();
        change(i,h,j,num,m);
        System.out.println(i);
        System.out.println(h);
        System.out.println(j);
        System.out.println(num[0]);
        System.out.println(m.a);
    }
    public static void change(int j,String s,Integer n,int[]a ,Mydata m){
        j+=j;
        s+="world";
        n+=1;
        a[0]+=1;
        m.a +=1;
    }
}
class Mydata{

    int a =10;
}
