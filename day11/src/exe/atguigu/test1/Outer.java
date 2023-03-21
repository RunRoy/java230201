package exe.atguigu.test1;

/**
 * @author lystart
 * @create 2023-02-15 10:28
 */
public class Outer {
    public static void main(String[] args) {
        // 匿名内部类作为接口的实现类出现

        Port port = new Port() {

            @Override
            public void num() {
                System.out.println("匿名内部类作为接口的实现类");
            }
        };
        port.num();

        //匿名类匿名对象
        new Port() {
            @Override
            public void num() {
                System.out.println("匿名类匿名对象");
            }
        }.num();


        test(new Port() {

            @Override
            public void num() {
                System.out.println("9999999");
            }
        });
    }

    public static void test(Port p) {
        p.num();
    }
}
