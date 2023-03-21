package com.atguigu.test4;

// jdk1.5之后的枚举
// enum声明的枚举类默认继承自Enum类
public enum Season{
    // enum声明的枚举类必须在类体的第一部分编写若干本类的属性
    SPRING("春"),
    SUMMER("夏"),
    AUTUMN("秋"),
    WINTER("冬");
    // enum声明的枚举类构造方法只能且必须是private修饰
    private String info;
//    private Season(){
//    }

    private Season(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

//    @Override
//    public String toString() {
//        return "Season{" +
//                "info='" + info + '\'' +
//                '}';
//    }
}
