package exe.atguigu.morningtest;

public class TestOne {
    public static void main(String[] args) {
        SeasonTwo seasonTwo = SeasonTwo.SPRING;
        System.out.println(seasonTwo);

        SeasonTwo seasonTwo1 = SeasonTwo.SPRING;

        System.out.println(seasonTwo == seasonTwo1);// 枚举对象应该使用==比较是否相等

        switch (seasonTwo){// switch中使用enum关键字声明的枚举类
            case SPRING:
                break;
            case SUMMER:
                break;
            case AUTUMN:
                break;
            case WINTER:
                break;
        }
    }
}
