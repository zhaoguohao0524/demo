package main.com.muyu.prototype;

/**
 * @author 赵先生
 * @date 2020/4/22 17:43
 * 原型模式浅拷贝，实体类继承自cloneable
 * 重写conle方法，就可以直接在需要调用的地方调用
 * 深拷贝的定义就是拷贝数组、对象等数据
 *深拷贝我就不写了，就是实体类加实现 serilazible，然后对象 对象名=super.clone()
 * 重新接收一下对象
 *
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        sheep sheep=new sheep("tom",1,"白色");
        System.out.println(sheep.getName()+sheep.getAge()+sheep.getColor());
        sheep clone = sheep.clone();
        System.out.println(clone.getName()+clone.getAge()+clone.getColor());
    }
}
