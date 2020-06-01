package main.com.muyu.prototype;

/**
 * @author 赵先生
 * @date 2020/4/22 17:34
 * 原型设计模式：克隆羊案例-克隆羊实体类
 *
 */

public class sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
    public sheep() {
        super();
    }

    @Override
    protected sheep clone() throws CloneNotSupportedException {
        return (sheep) super.clone();
    }
}
