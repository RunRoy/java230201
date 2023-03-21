package exe.atguigu.test;

public class TestMyInterOne {
    public static void main(String[] args) {
        // 匿名内部类作为接口的实现类出现
        // 匿名类有名对象
        MyInterOne myInterOne = new MyInterOne(){
            @Override
            public void methodOne() {
                System.out.println("in methodOne()~~~~~~~~~~~~~~~~~~~");
            }
        };
        myInterOne.methodOne();
        System.out.println("-------------------------------------------------------");
        // 匿名类匿名对象
        new MyInterOne(){
            @Override
            public void methodOne() {
                System.out.println("in methodOne11111111111111111111111111");
            }
        }.methodOne();
        System.out.println("----------------------------------------------------------");
        // 匿名类有名对象传参
        MyInterOne myInterOne1 = new MyInterOne() {
            @Override
            public void methodOne() {
                System.out.println("in methodOne22222222222222222222222222222");
            }
        };
        test(myInterOne1);
        System.out.println("-----------------------------------------------------");
        // 匿名类匿名对象传参
        test(new MyInterOne(){
            @Override
            public void methodOne() {
                System.out.println("in methodOne3333333333333333333333333333333");
            }
        });
    }

    public static void test(MyInterOne myInterOne){
        myInterOne.methodOne();
    }
}
