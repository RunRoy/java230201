public class Test11 {
    public static void main(String[] args) {
        // 打印出100-999之间的水仙花数
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            int he = ge*ge*ge + shi*shi*shi + bai*bai*bai;
            if(he == i) {
                System.out.println(i);
            }
        }

        // 1 1 2 3 5 …… 144 打印菲波那切数列
        int a = 1;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for (int i = 0; i < 10; i++) {
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
