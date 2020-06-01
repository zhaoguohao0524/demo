package main.com.muyu.builder;

import java.io.Serializable;

/**
 * @author 赵先生
 * @date 2020/4/24 18:26
 * 建造者模式-产品
 */
public class House implements Serializable ,Cloneable{
//    地基
    private String baise;
//    墙
    private String wall;
//    屋顶
    private String roofed;

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }

    public House(String baise, String wall, String roofed) {
        this.baise = baise;
        this.wall = wall;
        this.roofed = roofed;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public House() {
        super();
    }
}
