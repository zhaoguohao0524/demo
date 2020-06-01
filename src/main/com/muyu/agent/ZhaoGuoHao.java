package main.com.muyu.agent;

/**
 * @author 赵先生
 * @date 2020/5/31 19:07
 * 代理模式：相亲案例相亲人
 */
public class ZhaoGuoHao implements PerSon{
    private String sex="男";
    private String name="赵国豪";
    public void findLove() {
        System.out.println("我叫"+this.name+"性别："+this.sex+"我的要求：");
        System.out.println("白富美");
        System.out.println("140cm以上");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
