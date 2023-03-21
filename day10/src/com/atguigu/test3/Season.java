package com.atguigu.test3;

// jdk1.5之前的枚举
public class Season {
    // 在类体中声明本类的公开静态常量属性若干
    public static final Season SPRING = new Season("春");
    public static final Season SUMMER = new Season("夏");
    public static final Season AUTUMN = new Season("秋");
    public static final Season WINTER = new Season("冬");
    private String info;

    // 私有化所有的构造方法
    private Season(){
    }

    private Season(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Season{" +
                "info='" + info + '\'' +
                '}';
    }
}
