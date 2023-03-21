package exe.atguigu.morningtest;

// jdk1.5之前的枚举
public class SeasonOne {
    // 提供若干本类的公开静态常量属性
    public static final SeasonOne SPRING = new SeasonOne();
    public static final SeasonOne SUMMER = new SeasonOne();
    public static final SeasonOne AUTUMN = new SeasonOne();
    public static final SeasonOne WINTER = new SeasonOne();
    // 构造方法私有化
    private SeasonOne(){
    }
}
